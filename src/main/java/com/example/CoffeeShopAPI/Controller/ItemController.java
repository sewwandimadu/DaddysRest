package com.example.CoffeeShopAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CoffeeShopAPI.Model.Items;
import com.example.CoffeeShopAPI.Model.Orders;
import com.example.CoffeeShopAPI.Service.ItemService;

@RestController
@RequestMapping("/product")
public class ItemController {
	

	@Autowired
	private ItemService itemservice;
	
	@GetMapping("posts")
	public List<Items> allProducts() {
		
		return itemservice.findAllProducts();
	}

	@PostMapping("/")
	public String addProduct(@RequestBody Items data) {
		
		return itemservice.addProduct(data);
		 
	}
	
	@PostMapping("setorder")
	public String makeOrder(@RequestBody Orders  data) {
		
		return itemservice.makeOrder(data);
		 
	}

}
