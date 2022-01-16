package com.zeronthirty.ecommerce.dao;

import com.zeronthirty.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;



// allows a call from a different port, origin
@CrossOrigin("http://localhost:4200")
// entity type and primary key type <>
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
//                         * select all from
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}
