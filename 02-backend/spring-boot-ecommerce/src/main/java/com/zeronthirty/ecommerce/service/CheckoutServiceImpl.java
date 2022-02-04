package com.zeronthirty.ecommerce.service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.zeronthirty.ecommerce.dao.CustomerRepository;
import com.zeronthirty.ecommerce.dto.PaymentInfo;
import com.zeronthirty.ecommerce.dto.Purchase;
import com.zeronthirty.ecommerce.dto.PurchaseResponse;
import com.zeronthirty.ecommerce.entity.Customer;
import com.zeronthirty.ecommerce.entity.Order;
import com.zeronthirty.ecommerce.entity.OrderItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    private final CustomerRepository customerRepository;

    // public constructor injected
    public CheckoutServiceImpl(CustomerRepository customerRepository,
                               @Value("${stripe.key.secret}")String secretKey){
        this.customerRepository = customerRepository;
        Stripe.apiKey = secretKey;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // retrieve order info from dto
        Order order = purchase.getOrder();
        // gen tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);
        // pop order with order items
        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(order::add);
        // populate order with addresses
        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());
        // pop customer with order
        Customer customer = purchase.getCustomer();

        //check if existing customer

        String theEmail = customer.getEmail();
        Customer customerFromDB = customerRepository.findByEmail(theEmail);
        if (customerFromDB != null){
            customer = customerFromDB;
        }
        customer.add(order);
        // save to database
        customerRepository.save(customer);
        //return response
        return  new PurchaseResponse(orderTrackingNumber);
    }

    @Override
    public PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException {

        List<String> paymentMethodTypes = new ArrayList<>();
        paymentMethodTypes.add("card");
        Map<String, Object> params = new HashMap<>();
        params.put("amount", paymentInfo.getAmount());
        params.put("currency", paymentInfo.getCurrency());
        params.put("payment_method_types", paymentMethodTypes);

        return PaymentIntent.create(params);
    }

    private String generateOrderTrackingNumber() {
        //gen random UUID number (UUID version-4 **research)
        return UUID.randomUUID().toString();

    }
}
