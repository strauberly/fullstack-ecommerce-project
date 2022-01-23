package com.zeronthirty.ecommerce.service;

import com.zeronthirty.ecommerce.dao.CustomerRepository;
import com.zeronthirty.ecommerce.dto.Purchase;
import com.zeronthirty.ecommerce.dto.PurchaseResponse;
import com.zeronthirty.ecommerce.entity.Customer;
import com.zeronthirty.ecommerce.entity.Order;
import com.zeronthirty.ecommerce.entity.OrderItem;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    private final CustomerRepository customerRepository;

    // public constructor injected
    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // retrieve order info from dto
        Order order = purchase.getOrder();
        // gen tracking number
        String orderTrackingNumber = genOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);
        // pop order with order items
        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(order::add);
        // populate order with addresses
        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());
        // pop customer with order
        Customer customer = purchase.getCustomer();
        customer.add(order);
        // save to database
        customerRepository.save(customer);
        //return response
        return  new PurchaseResponse(orderTrackingNumber);
    }

    private String genOrderTrackingNumber() {
        //gen random UUID number (UUID version-4 **research)
        return UUID.randomUUID().toString();

    }
}
