
package com.spring.jdbcProject.dao;

import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.stereotype.Repository;
import com.spring.jdbcProject.dto.MemberDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

@Repository
public class MemberDAO {
	
	private DataSource dataFactory;
	
	@Autowired
	public MemberDAO(DataSource dataSource) {
		try {
			this.dataFactory=dataSource;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원정보 조회 : 전체 회원정보 select해서 반환
	public ArrayList<MemberDTO> memberSelect(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//데이터 저장해서 반환할 ArrayList객체
		ArrayList<MemberDTO> memList = new ArrayList<>();
		
		try {
			System.out.println("check");
			con = dataFactory.getConnection(); //db con 객체 connection pool로부터 할당
			
			String sql = "select * from Member"; 
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String memId = rs.getString("memId");
				String memPwd = rs.getString("memPwd");
				String memName = rs.getString("memName");
				String memEmail = rs.getString("memEmail");
				Date memJoinDate = rs.getDate("memJoinDate");
				
				//MemberDTO에 담아서 
				MemberDTO dto = new MemberDTO();
				dto.setMemId(memId);
				dto.setMemPwd(memPwd);
				dto.setMemName(memName);
				dto.setMemEmail(memEmail);
				dto.setMemJoinDate(memJoinDate);
				
				//ArrayList에 추가
				memList.add(dto);
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
