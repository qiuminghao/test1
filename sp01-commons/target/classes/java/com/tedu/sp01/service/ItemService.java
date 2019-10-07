package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
 
	//根据订单的id获取商品的列表
	List<Item> getItems(String orderId);
	//商品的列表
	void decreaseNumbers(List<Item> list);
}
