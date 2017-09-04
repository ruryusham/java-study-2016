

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcurateNumber
 */
@WebServlet("/CalcurateNumber")
public class CalcurateNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcurateNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("calcurate-number.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String strNumLeft = request.getParameter("numL");
		int nNumLeft = Integer.parseInt(strNumLeft);
		System.out.println(nNumLeft);

		String strNumRight = request.getParameter("numR");
		int nNumRight = Integer.parseInt(strNumRight);
		System.out.println(nNumRight);

		int wa = nNumLeft + nNumRight;
		int sa = nNumLeft - nNumRight;
		int seki = nNumLeft * nNumRight;
		int syo = nNumLeft / nNumLeft;

		request.setAttribute("wa", wa);
		request.setAttribute("sa", sa);
		request.setAttribute("seki", seki);
		request.setAttribute("syo", syo);

		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
