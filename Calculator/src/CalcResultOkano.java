

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputNumber
 */
@WebServlet("/CalcResultOkano")
public class CalcResultOkano extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcResultOkano() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("calc-result-okano.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 数値1をリクエストパラメータとして取得
		String sNum1 = request.getParameter("num1");
		int num1 =Integer.parseInt(sNum1);
		System.out.println(num1);

		// 数値2をリクエストパラメータとして取得
		String sNum2 = request.getParameter("num2");
		int num2 =Integer.parseInt(sNum2);
		System.out.println(num2);

		// 足し算
		int wa = num1 + num2;

		// waという名前で足し算の結果をリクエストに設定
		request.setAttribute("wa", wa);

		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
