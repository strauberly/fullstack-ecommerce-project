package com.zeronthirty.ecommerce.controller;

import com.zeronthirty.ecommerce.dto.Purchase;
import com.zeronthirty.ecommerce.dto.PurchaseResponse;
import com.zeronthirty.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin ("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;
    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }



}
