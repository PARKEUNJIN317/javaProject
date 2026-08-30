package forward.binding;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BindingRedirect
 */
@WebServlet("/bindingfirst")
public class BindingRedirectFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * redirect진행
	 * Attribute 에 전달할 데이터를 저장해서 보냄
	 * request.setAttribute("attr이름","attr값)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		request.setAttribute("name", "홍길동");
		request.setAttribute("address", "서울시 강남구");
		
		response.sendRedirect("bindingsecond");		
		//secondRedirect 는 request/response객체 소멸시킴
		//Attribute는 객체와 같이 소멸됨
		//bindingsecond는 새로운 request와 response를 전달 받음 -> Attribute없음
		//Attribute는 request 객체가 소멸없이 전달 되어야 사용가능
		
				
	}

}
