package exam.ojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProductDAO {
	
	public ArrayList<ProductVO> productSelect(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DBConnect dbCon = new DBConnect();
		
		ArrayList<ProductVO> prdList = new ArrayList<ProductVO>();
		
		
		try {
			conn = dbCon.getConnection();
			String query = "select * from product";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
 
			while (rs.next()) {
				String no=rs.getString("prdNo");
				String name=rs.getString("prdName");
				String maker=rs.getString("prdMaker");
				String color=rs.getString("prdColor");
 
				ProductVO vo = new ProductVO(no, name, maker, color);
				vo.setNo(no);
				vo.setName(name);
				vo.setMaker(maker);
				vo.setColor(color);
				
				prdList.add(vo);
			}
 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
 
		return prdList;
	}

}
