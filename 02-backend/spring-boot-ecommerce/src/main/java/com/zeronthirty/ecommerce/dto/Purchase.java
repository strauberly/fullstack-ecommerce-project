package com.zeronthirty.ecommerce.dto;

import com.zeronthirty.ecommerce.entity.Address;
import com.zeronthirty.ecommerce.entity.Customer;
import com.zeronthirty.ecommerce.entity.Order;
import com.zeronthirty.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
