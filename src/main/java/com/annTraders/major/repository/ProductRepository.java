package com.annTraders.major.repository;

import com.annTraders.major.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_Id(int id);
    List<Product> findByNameContainingIgnoreCaseOrDescriptionIgnoreCase(String key1, String key2);
}
