package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/isertMember2")
public class JoinResServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("usereName");
		String id = request.getParameter("usereId");
		String pw = request.getParameter("userePw");
		String phone = request.getParameter("userePhone");
		String year = request.getParameter("usereYear");
		String interest = request.getParameter("interest");
		String major = request.getParameter("userMajor");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("성명 : " + name);
		out.println("ID : " + id);
		out.println("비밀번호 : " + pw);
		out.println("휴대폰번호 : " + phone);
		out.println("학년 : " + year);
		out.println("관심분야 : " + interest);
		out.println("학과 : " + major);
	}
}
