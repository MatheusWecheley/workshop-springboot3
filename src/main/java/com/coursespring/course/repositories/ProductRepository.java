package com.coursespring.course.repositories;

import com.coursespring.course.entities.Category;
import com.coursespring.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
