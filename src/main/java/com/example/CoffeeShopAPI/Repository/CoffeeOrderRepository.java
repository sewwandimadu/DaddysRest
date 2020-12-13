package com.example.CoffeeShopAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CoffeeShopAPI.Model.Items;
import com.example.CoffeeShopAPI.Model.Orders;

public interface CoffeeOrderRepository extends JpaRepository<Orders, Integer> {

}
