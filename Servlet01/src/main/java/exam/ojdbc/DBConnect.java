package exam.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			String user = "SQL_SELECT";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			
		} catch (ClassNotFoundException e) {
			// ojdbc 드라이버(jar)가 프로젝트에 없을 때 발생
			e.printStackTrace();
			throw new RuntimeException("Oracle JDBC 드라이버를 찾을 수 없습니다. WEB-INF/lib에 ojdbc jar가 있는지 확인하세요.", e);
			
		} catch (Exception e) {
			// URL/계정/비밀번호/리스너 문제 등 접속 관련 예외
			e.printStackTrace();
			throw new RuntimeException("DB 연결에 실패했습니다: " + e.getMessage(), e);
		}
		
		return con;
	}
}