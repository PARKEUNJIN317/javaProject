package exam;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 클라이언트가 form 태그를 통해 전송한 데이터(파라미터)를 추출해서 처리
 */
@WebServlet("/bookInsert")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void init(ServletConfig config) throws ServletException {
		System.out.println("객체생성");
	}

	public void destroy() {
	}


	/*
	 * form method post 요청 처리
	 * 1개의 파라미터 value를 추출할 때 사용 : getParameter(input type text, password, radio 1개 값 전송)
	 * 동일 파라미터 명으로 여러개의 파라미터가 전송되면 getParameter는 처음 보이는 파라미터의 값만 반환
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String book_number = request.getParameter("book_number");
		String book_name = request.getParameter("book_name");
		String book_author = request.getParameter("book_author");
		String book_price = request.getParameter("book_price");
		String book_date = request.getParameter("book_date");
		String book_stock = request.getParameter("book_stock");
		String pub_number = request.getParameter("pub_number");
		
		System.out.println("도서번호 : " + book_number);
		System.out.println("도서명 : " + book_name);
		System.out.println("저자 : " + book_author);
		System.out.println("가격 : " + book_price);
		System.out.println("발행일 : " + book_date);
		System.out.println("재고 : " + book_stock);
		System.out.println("출판사번호 : " + pub_number);
		
		
	}

}
