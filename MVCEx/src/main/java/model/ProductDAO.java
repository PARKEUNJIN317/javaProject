package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBConnect;

public class ProductDAO {
	
	public ArrayList<ProductDTO> productSelect(){
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ProductDTO> prdList = new ArrayList<>();
		
		try {
			con=DBConnect.getConn();
			String str= "select* from product";
			pstmt = con.prepareStatement(str);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String prdNo = rs.getString("prdNo");
				String prdName = rs.getString("prdName");
				String prdMaker = rs.getString("prdMaker");
				String prdColor = rs.getString("prdColor");
				
				ProductDTO prd = new ProductDTO();
				prd.setPrdNo(prdNo);
				prd.setPrdName(prdName);
				prd.setPrdMaker(prdMaker);
				prd.setPrdColor(prdColor);
				
				prdList.add(prd);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					rs.close();
					pstmt.close();
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		return prdList;
		
	}

}
