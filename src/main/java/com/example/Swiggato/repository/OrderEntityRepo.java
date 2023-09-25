package com.example.Swiggato.repository;

import com.example.Swiggato.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderEntityRepo extends JpaRepository<OrderEntity,Integer> {
}
