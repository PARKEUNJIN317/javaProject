package exam.binding;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import forward.memberbinding.MemberVO;

@WebServlet("/productView")
public class ProductViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ArrayList<ProductVO> productList = (ArrayList<ProductVO>)request.getAttribute("productList");
		
		//응답처리
		out.print("<html><head></head><body>");
		out.print("<table border=1><tr align='center' bgcolor='gold'>");
		out.print("<td>제품번호</td><td>제품명</td><td>이름</td><td>제조사</td><td>컬러</td></tr>");
		
		for(int i=0; i<productList.size(); i++) {
			ProductVO vo = productList.get(i);
			String no=vo.getProductNo();
			String name=vo.getProductName();
			String maker=vo.getProductMaker();
			String color=vo.getProductColor();
	
			
			//한행씩 테이블에 포함
			out.print("<tr><td>" + no + "</td><td>" + 
									name + "</td><td>" +
									maker	+ "</td><td>" +
									color	+ "</td><td>" +
									"<a href ='/Servlet01/memberDelete?id=" +name +"'>삭제</a></td></tr>"
									
					);
			
		}
		out.print("</table></body></html>");
	}

}
