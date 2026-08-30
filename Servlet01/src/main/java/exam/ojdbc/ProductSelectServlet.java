package exam.ojdbc;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ojdbc.MemberDAO;
import ojdbc.MemberVO;


@WebServlet("/productSelect")
public class ProductSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductVO> prdList = dao.productSelect();
		
		request.setAttribute("prdList", prdList);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("productView2");
		dispatch.forward(request, response);
		
		
		
		
	}

}
