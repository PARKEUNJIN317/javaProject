package com.spring_mvc.mybatisEx.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_mvc.mybatisEx.service.BookService;
import com.spring_mvc.mybatisEx.vo.BookVO;

/*
 * 이 클래스는 res api를 구현하는 클래스(컨트롤러)
 * 모든 메소드에 @ResponseBody를 첨부하는 것과 같음
 */
@RestController
public class BookRestController {
	
	@Autowired
	BookService service;
	
	 @RequestMapping("/book/bookSearch3")
	 public ArrayList<BookVO> productSearch1(@RequestParam HashMap<String, Object> map){
		 ArrayList<BookVO> bookList = service.bookSearch(map);
		 return bookList;
	 }
	
}
