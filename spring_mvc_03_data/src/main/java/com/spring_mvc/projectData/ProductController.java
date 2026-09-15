package com.spring_mvc.projectData;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	
	
	@RequestMapping("/product/productForm")
	public String productFormView() {
		return "product/productForm";
	}
	
	
	@RequestMapping("/product/newProduct")
	public String insertProduct(HttpServletRequest request, Model model) {
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String maker = request.getParameter("maker");
		String date = request.getParameter("date");
		String stock = request.getParameter("stock");
		
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("maker", maker);
		model.addAttribute("date", date);
		model.addAttribute("stock", stock);
		
		return "product/productResult";
	}
	
	@RequestMapping("/product/productForm2")
	public String productFormView2() {
		return "product/productForm2";
	}
	
	@RequestMapping("/product/newProduct2")
	public String insertProduct2(@RequestParam("no") String no,
								@RequestParam("name") String name,
								@RequestParam("price") String price,
								@RequestParam("maker") String maker,
								@RequestParam("date") String date,
								@RequestParam("stock") String stock,
								Model model) {
		
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("maker", maker);
		model.addAttribute("date", date);
		model.addAttribute("stock", stock);
		
		return "product/productResult2";
		
	}
	
	@RequestMapping("/product/productForm3")
	public String productFormView3() {
		return "product/productForm3";
	}
	
	@RequestMapping("/product/newProduct3")
	public String insertProduct3(Product product) {
		System.out.println(product.getNo());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getMaker());
		System.out.println(product.getDate());
		System.out.println(product.getStock());
		
		return "product/productResult3";
		
	}
	
	@RequestMapping("/product/productForm4")
	public String productFormView4() {
		return "product/productForm4";
	}
	
	@RequestMapping("/product/newProduct4")
	public String insertProduct4(@ModelAttribute("prd") Product product) {
	
		return "product/productResult4";
		
	}
	
	@RequestMapping("/product/productDataView/{prdName}")
	public String productDataView(@PathVariable String prdName) {
		System.out.println(prdName);
		return "product/productResult";
		
	}
	
	@RequestMapping("/product/productDataView/{prdName}/{prdStock}/{prdNo}")
	public String productDataView2(@PathVariable String prdName,
									@PathVariable String prdStock,
									@PathVariable String prdNo) {
		System.out.println(prdName);
		System.out.println(prdStock);
		System.out.println(prdNo);
		return "product/productResult";
		
	}
	
	@RequestMapping("/product/productSearchForm")
	public String productSearchForm() {
		return "product/prdSearchForm";
	}
	
	@RequestMapping("/product/productSearch")
	public String productSearch(@RequestParam HashMap<String, Object> param, Model model) {
		//param값 출력 : key로 value찾아서 출력 -> 파라미터명이 key, 파라미터 값 value
		System.out.println(param.get("type"));
		System.out.println(param.get("keyword"));
		
		//검색결과를 view에 전달하기 위한 준비
		Product vo1 = new Product();
		vo1.setNo("001");
		vo1.setName("아이폰폴더블");
		vo1.setMaker("애플");
		vo1.setPrice("3290000");
		vo1.setDate("2026-09-10");
		vo1.setStock("100");
		
		Product vo2 = new Product();
		vo2.setNo("002");
		vo2.setName("갤럭시폴드8");
		vo2.setMaker("삼성");
		vo2.setPrice("2300000");
		vo2.setDate("2026-07-27");
		vo2.setStock("50");
		
		
		
		ArrayList<Product> prdList = new ArrayList<>();
		prdList.add(vo1);
		prdList.add(vo2);
		
		model.addAttribute("prdList", prdList);
		
		return "product/prdSearchResult";
	}
	
	

}
