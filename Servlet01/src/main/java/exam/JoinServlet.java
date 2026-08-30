package exam;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/isertMember")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("usereName");
		String id = request.getParameter("usereId");
		String pw = request.getParameter("userePw");
		String phone = request.getParameter("userePhone");
		String year = request.getParameter("usereYear");
		String interest = request.getParameter("interest");
		String major = request.getParameter("userMajor");
		
		System.out.println("성명 : " + name);
		System.out.println("ID : " + id);
		System.out.println("비밀번호 : " + pw);
		System.out.println("휴대폰번호 : " + phone);
		System.out.println("학년 : " + year);
		System.out.println("관심분야 : " + interest);
		System.out.println("학과 : " + major);
		
	}

}
