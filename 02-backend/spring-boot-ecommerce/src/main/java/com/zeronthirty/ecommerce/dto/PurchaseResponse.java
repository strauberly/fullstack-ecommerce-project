package com.zeronthirty.ecommerce.dto;

import lombok.Data;
// sends back java object as json
@Data
public class PurchaseResponse {
    private final String orderTrackingNumber;
}
