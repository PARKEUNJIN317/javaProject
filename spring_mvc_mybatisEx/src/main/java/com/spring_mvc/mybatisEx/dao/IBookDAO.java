package com.spring_mvc.mybatisEx.dao;

import java.util.ArrayList;
import com.spring_mvc.mybatisEx.vo.BookVO;

public interface IBookDAO {
	void insertBook(BookVO bookVo);
	void updateBook(BookVO bookVo);
	void deleteBook(String bookNo);
	ArrayList<BookVO> listAllBook();
	BookVO detailViewBook(String bookNo);
	String bookNoCheck(String bookNo);
}
