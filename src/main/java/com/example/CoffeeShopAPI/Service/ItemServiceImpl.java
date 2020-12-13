package com.example.CoffeeShopAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CoffeeShopAPI.Model.Items;
import com.example.CoffeeShopAPI.Model.Orders;
import com.example.CoffeeShopAPI.Repository.CoffeeOrderRepository;
import com.example.CoffeeShopAPI.Repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{

	
	@Autowired
	private ItemRepository itemrepository;
	@Autowired
	private CoffeeOrderRepository OrderRepository;
	
	@Override
	public List<Items> findAllProducts() {
		List<Items> allitem = itemrepository.findAll();
		return allitem;
	}

	@Override
	public String addProduct(Items data) {
		itemrepository.save(data);
		return "Item Save Success!";
	}

	@Override
	public String makeOrder(Orders data) {
		OrderRepository.save(data);
		return "Order Complete Successful!";
	}

}
