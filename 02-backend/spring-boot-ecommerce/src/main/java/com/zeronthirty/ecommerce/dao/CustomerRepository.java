package com.zeronthirty.ecommerce.dao;

import com.zeronthirty.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
