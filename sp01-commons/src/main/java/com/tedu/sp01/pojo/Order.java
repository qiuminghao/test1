package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	//这是订单的id
	private String id;
	//这是订单的相对应的用户
	private User user;
	//这是该订单里面有的商品列表
	private List<Item> items;
}
