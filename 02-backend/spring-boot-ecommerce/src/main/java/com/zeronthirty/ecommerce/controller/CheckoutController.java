package com.zeronthirty.ecommerce.controller;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.zeronthirty.ecommerce.dto.PaymentInfo;
import com.zeronthirty.ecommerce.dto.Purchase;
import com.zeronthirty.ecommerce.dto.PurchaseResponse;
import com.zeronthirty.ecommerce.service.CheckoutService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        //        dont fall into redundant trap
        return checkoutService.placeOrder(purchase);
    }
    @PostMapping("/payment-intent")
    public ResponseEntity<String> createPaymentIntent(@RequestBody PaymentInfo paymentInfo)
        throws StripeException{
        PaymentIntent paymentIntent = checkoutService.createPaymentIntent(paymentInfo);
        String paymentStr = paymentIntent.toJson();

        return new ResponseEntity<>(paymentStr, HttpStatus.OK);
    }




}
