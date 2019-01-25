package com.yaning.controller;

/**
 * @author    Yaning Liu
 *
 * @filename  ProductController.java
 *
 * @date      2019-01-24
 *
 */


import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaning.model.Product;
import com.yaning.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	
	
	@Resource(name="productService")
	private ProductService productService;
	
	
	@Resource(name="productService2")
	private ProductService productService2;
	
	//����URL��http://localhost:8080/sas1.1/user/addUser.do
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "addProduct")
	public String addUser(){
		System.out.println("**********findUser***********");
		JSONObject obj = new JSONObject();
		User user = new User("user", "123456", "����", "1127447798@qq.com");
		userService.addUser(user);
		User user2 = new User("user2", "123456", "����", "1127447798@qq.com");
		userService2.addUser(user2);
		return obj.toString();
	}
}
