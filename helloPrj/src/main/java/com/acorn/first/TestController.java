package com.acorn.first;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@GetMapping("/result1")
	public String m1(Model model) {
		model.addAttribute("cheers", "파이팅해야지!");
		return "result1";		// view 이름
	}
	
	@GetMapping("/result2")
	public void m2(Model model) {
		model.addAttribute("cheers", "힘내!");
	}
	
	@GetMapping("/result3")
	public String m3(Model model) {
		model.addAttribute("cheers", "fighting!");
		return "result3";
	}
	
	@ResponseBody								// 한글 데이터가 제대로 한글로 나오게 인코딩
	@GetMapping(value = "/result4", produces="application/json;charset=UTF-8")
	public String m4() {
		return "아라라라라이";
	}
	
	@GetMapping("/result5")
	public void m6(HttpServletResponse response) {
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/plain;charset=utf-8");
			response.getWriter().println("데이터 간드아");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GetMapping("/result6")
	public ArrayList<Book> m6(Model model){
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("팔만대장경", "해인사", 100000));
		list.add(new Book("종묘제례악", "종묘", 100000));
		list.add(new Book("성경", "교황청", 100000));
		model.addAttribute("list", list);
		return  list;
	}
	
	@ResponseBody
	@GetMapping("/bookdata")
	public ArrayList<Book> m7(){
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("팔만대장경", "해인사", 100000));
		list.add(new Book("종묘제례악", "종묘", 100000));
		list.add(new Book("성경", "교황청", 100000));
		return list;
	}
	
	
}
