package com.spring_mvc.jdbc2.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.jdbcProject.dto.MemberDTO;
import com.spring_mvc.jdbc2.dto.ProductDTO;

@Repository
public class ProductRepo {
	
	private DataSource dataFactory;
	
	@Autowired
	public DataSource ProductRepo(DataSource dataSource) {
		
		try {
			this.dataFactory=dataSource;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<ProductDTO> productSelect(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//데이터 저장해서 반환할 ArrayList객체
		ArrayList<ProductDTO> prdList = new ArrayList<>();
		
		try {
			System.out.println("check");
			con = dataFactory.getConnection(); //db con 객체 connection pool로부터 할당
			
			String sql = "select * from Product"; 
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String prdNo = rs.getString("prdNo");
				String prdName = rs.getString("prdName");
				String prdMaker = rs.getString("prdMaker");
				String prdColor = rs.getString("prdColor");
				
				ProductDTO dto = new ProductDTO();
				dto.setPrdNo(prdNo);
				dto.setPrdName(prdName);
				dto.setPrdMaker(prdMaker);
				dto.setPrdColor(prdColor);
				
				
				prdList.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				System.out.println("con : "+ con);
				rs.close();
				pstmt.close();
				con.close();
				
			}catch(Exception e) {
			
			}
		}
		return memList;
		
	}

}

