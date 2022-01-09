package com.zeronthirty.ecommerce.dao;

import com.zeronthirty.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
// allows a call from a different port, origin
@CrossOrigin("http://localhost:4200")
// entity type and primary key type <>
public interface ProductRepository extends JpaRepository<Product, Long> {
}
