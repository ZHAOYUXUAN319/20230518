package com.bilibili.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.entity.ReturnObj;
import com.bilibili.entity.User;
import com.bilibili.service.UserService;

@Controller
public class UserController {
@Autowired

private UserService userService;
@PostMapping("/login")
@ResponseBody
public ReturnObj login(@RequestBody JSONObject params) {
	String username=params.getString("username");
	String password=params.getString("password");
	User user=new User(username,password);
	Boolean result = userService.verifyUser(user);
	if(result) {
		return ReturnObj.buildSuccess();
	}else {
		return ReturnObj.buildFault();
	}
	
}
}
