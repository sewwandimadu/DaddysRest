package com.example.CoffeeShopAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CoffeeShopAPI.Model.Items;

public interface ItemRepository extends JpaRepository<Items, Integer> {

}
