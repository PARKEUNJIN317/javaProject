package ex1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductMain {

	public static void main(String[] args) {
		PrdJDBConn prdCon = new PrdJDBConn();
		Connection con = prdCon.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		if(con == null) {
			System.out.println("db 생성 실패");
		}else {
			System.out.println("db 생성 성공");
			try{
				String query = "SELECT * FROM product";
				stmt = con.createStatement();
				rs = stmt.executeQuery(query);
				System.out.println("----------------- 전체 상품 정보 조회 ------------------");
				System.out.println("상품번호 \t 상품명 \t 상품가격 \t 제조사 \t 색깔 \t 카테고리번호");
				
				while(rs.next()) {
					String prdNo = rs.getString(1);
					String prdName = rs.getString(2);
					int prdPrice = rs.getInt(3);
					String prdMaker = rs.getString(4);
					String prdColor = rs.getString(5);
					int ctgno = rs.getInt(6);
					
					System.out.format("%-4s\t %-50s %8d \t %-30s %20s \t% 3d \n",
							prdNo, prdName, prdPrice, prdMaker, prdColor, ctgno);
					
				}
				rs.close();
				stmt.close();
				con.close();
				
			}catch(Exception e){
				System.out.println("오류발생");
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
