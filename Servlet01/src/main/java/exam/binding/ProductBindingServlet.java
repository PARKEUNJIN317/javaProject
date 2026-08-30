package exam.binding;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import forward.memberbinding.MemberVO;


@WebServlet("/productbinding")
public class ProductBindingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductVO vo1 = new ProductVO("111", "아이폰","애플","실버");
		ProductVO vo2 = new ProductVO("222", "갤럭시","삼성","골드");
		ProductVO vo3 = new ProductVO("333", "갤럭시울트라","삼성","골드");
		
		ArrayList<ProductVO> productList = new ArrayList<>();
		productList.add(vo1);
		productList.add(vo2);
		productList.add(vo3);
		
		request.setAttribute("productList", productList);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("productView");
		dispatch.forward(request, response);
		
		
	}

}
