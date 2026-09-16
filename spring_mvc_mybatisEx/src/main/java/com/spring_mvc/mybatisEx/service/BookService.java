package com.spring_mvc.mybatisEx.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring_mvc.mybatisEx.dao.IBookDAO;
import com.spring_mvc.mybatisEx.vo.BookVO;

public class BookService implements IBookService{
	
	@Autowired
	@Qualifier("IBookDAO")
	IBookDAO dao;
	
	
	
	@Override
	public String bookNoCheck(String bookNo) {
		String res = dao.bookNoCheck(bookNo);
		String result ="available";
		if(res!=null) {
			result="no_available";
		}
		return result;
	}

	@Override
	public void insertBook(BookVO bookVo) {
		dao.insertBook(bookVo);
		
	}

	@Override
	public void updateBook(BookVO bookVo) {
		dao.updateBook(bookVo);
		
	}

	@Override
	public void deleteBook(String bookNo) {
		dao.deleteBook(bookNo);
		
	}

	@Override
	public ArrayList<BookVO> listAllBook() {
		return dao.listAllBook();
	}

	@Override
	public BookVO detailViewBook(String bookNo) {
		return dao.detailViewBook(bookNo);
	}
	
	

}
