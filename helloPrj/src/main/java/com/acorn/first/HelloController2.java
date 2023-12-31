package com.acorn.first;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController2 {

	@ResponseBody		// 이걸 써야 return을 스트링으로 인식
	@GetMapping("/data1")
	public String method() {
		return "hi";
	}
	
	@ResponseBody
	@GetMapping("/data2")
	public User method2() {
		User user = new User("taem", "4321");
		
		return user;
	}
	
	@ResponseBody
	@GetMapping("/data3")
	public ArrayList<User> method3(){
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("test1", "1111"));
		list.add(new User("test2", "1221"));
		list.add(new User("test3", "1441"));
		list.add(new User("test4", "1121"));
		return list;
	}
}
