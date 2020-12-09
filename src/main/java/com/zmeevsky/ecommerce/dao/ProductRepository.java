package com.zmeevsky.ecommerce.dao;

import com.zmeevsky.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
