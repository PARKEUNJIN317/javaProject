package ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class PrdJDBConn {
	public Connection getConnection() {
		Connection con = null;
		
		try{
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1" ;
			String user = "SQL_USER";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url,user,pwd);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}	 
}
