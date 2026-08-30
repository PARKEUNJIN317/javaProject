package exam.ojdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/productView2")
public class ProductView extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ArrayList<ProductVO> prdList = (ArrayList<ProductVO>)request.getAttribute("prdList");
		
		//응답처리
		out.print("<html><head></head><body>");
		out.print("<table border=1><tr align='center' bgcolor='gold'>");
		out.print("<td>제품번호</td><td>제품명</td><td>제조사</td><td>컬러</td><td>삭제</td></tr>");
		
		for(int i=0; i<prdList.size(); i++) {
			ProductVO vo = prdList.get(i);
			String no = vo.getNo();
			String name = vo.getName();
			String maker = vo.getMaker();
			String color = vo.getColor();
			
			out.print("<tr><td>" + no + "</td><td>" +
								   name + "</td><td>" +
								   maker + "</td><td>" +
								   color + "</td><td>" +
								   "<a href='/Servlet01/memberDelete?id=" + no + "'>삭제</a></td></tr>"
					);
		}			
		out.print("</table></body></html>");
	}

}
