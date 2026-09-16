package com.spring_mvc.mybatisEx.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_mvc.mybatisEx.service.BookService;
import com.spring_mvc.mybatisEx.vo.BookVO;

@Controller
public class BookController {
	@Autowired
	BookService service;
	
	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}
	
	@RequestMapping("/book/listAllBook")
	public String listAllBook(Model model) {
		ArrayList<BookVO> bookList = service.listAllBook();
		model.addAttribute("bookList",bookList);
		return "book/bookListView";
	}
	
	@RequestMapping("/book/newBookForm")
	public String newBookForm() {
		return "book/newBookForm";
	}
	
	@RequestMapping("/product/insertBook")
	public String insertBook(BookVO vo) {
		service.insertBook(vo);//완료신호 반환되면 저장되었다는 신호이므로 다음 내용 진행
		return "redirect:/book/listAllBook";
	}
	
	@RequestMapping("/book/detailViewBook/{bookNo}")
	public String detailViewBook(@PathVariable String bookNo, Model model) {
		BookVO vo = service.detailViewBook(bookNo);
		model.addAttribute("vo",vo);
		return "book/bookDetailView";
	}
	
	 @RequestMapping("/book/updateBookForm/{bookNo}")
	 public String updateBookForm(@PathVariable String bookNo, Model model) {
		 BookVO vo = service.detailViewBook(bookNo);
		 model.addAttribute("book", vo);
		 return "book/updateBookForm";
	 }
	 
	 @RequestMapping("/book/updateBook")
	 public String updateBook(BookVO vo) {
		 service.updateBook(vo);
		 return "redirect:/book/listAllBook";
	 }
	 
	 @RequestMapping("/book/deleteBook/{bookNo}")
	 public String deleteProduct(@PathVariable String bookNo) {
		 service.deleteBook(bookNo);
		 return "redirect:/book/listAllBook";
	 }
	 
	 
	 //도서중복번호 체크
	 
	 @ResponseBody
	 @RequestMapping("/book/bookNoCheck")
	 public String bookNoCheck(@RequestParam("bookNo") String bookNo) {
		 String result = service.bookNoCheck(bookNo);
		 return result;
	 }
	 
	 @ResponseBody
	 @RequestMapping("/book/bookNoCheck3")
	 public String bookNoCheck3(@RequestBody HashMap<String,String> map) {
		 String bookNo = map.get("bookNo");
		 String result = service.bookNoCheck(bookNo);
		 System.out.println(result);
		 return result;
	 }
	

}
