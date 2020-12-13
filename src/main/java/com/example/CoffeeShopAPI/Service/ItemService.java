package com.example.CoffeeShopAPI.Service;

import java.util.List;

import com.example.CoffeeShopAPI.Model.Items;
import com.example.CoffeeShopAPI.Model.Orders;

public interface ItemService {
	
List<Items> findAllProducts();
	
	String addProduct(Items data);
	String makeOrder(Orders data);

}
