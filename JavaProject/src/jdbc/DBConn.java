package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	public Connection getConnection() {
	Connection con = null;
	
	// 외부 자원 활용 : try ~ catch 구문 안에서 진행되거나 throws문을 추가하거나
	try {
		//dbms 연결 관련 코드
		// JDBC DIRVER클래스의 객체 생성 : 런타임시 JDBC 드라이버 로드(자동로드 : 생략가능)
		//Class.forName("oracle.jdbc.dirver.OracleDriver");
		//접속 변수 생성
		//"oracle 접속종류: @dbms주소(도메인, ip):포트:sid 또는 포트/ 서비스name
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String user = "SQL_USER";
		String pwd = "1234";
		
		//2. Connection interface 참조변수에 구현객체 대입(db 접속 후 접속 객체 반환) -> DriverManager
		con = DriverManager.getConnection(url, user, pwd);
		// db 접속 실패하면 catch, 저장값은 null
	}catch(Exception e) {
		e.printStackTrace();
	}
	return con;
	}
}
