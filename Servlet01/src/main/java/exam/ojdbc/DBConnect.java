package exam.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public Connection getConnection() {
	Connection con = null;
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String user = "PDBSQL_SELECT";
		String pwd = "1234";
		
		con = DriverManager.getConnection(url, user, pwd);
	}catch(Exception e) {
		e.printStackTrace();
	}
	return con;
	}
}
