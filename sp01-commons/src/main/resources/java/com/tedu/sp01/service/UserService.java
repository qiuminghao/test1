package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//根据用户的id获取用户的信息
	User getUser(Integer id);
	//增加用户的zhi分值
	void addScore(Integer id, Integer score);
}
