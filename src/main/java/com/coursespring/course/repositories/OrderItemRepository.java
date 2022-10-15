package com.coursespring.course.repositories;

import com.coursespring.course.entities.OrderItem;
import com.coursespring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
