package com.zeronthirty.ecommerce.service;

import com.zeronthirty.ecommerce.dto.Purchase;
import com.zeronthirty.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
