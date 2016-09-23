

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcResultkomatsu
 */
@WebServlet("/CalcResultkomatsu")
public class CalcResultkomatsu extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcResultkomatsu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("calc-result-komatsu.jsp");
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

	    //引き算
	    int sa=num1-num2;

	    //saという名前で引き算の結果をリクエストに設定
	    request.setAttribute("sa",sa);

	    //掛け算
	    int seki =num1*num2;

	  //sekiという名前で掛け算の結果をリクエストに設定
	    request.setAttribute("seki",seki);

	   //割り算
	    int syou=num1/num2;

	  //syouという名前で割り算の結果をリクエストに設定
	    request.setAttribute("syou",syou);

	    doGet(request, response);
	}


}
