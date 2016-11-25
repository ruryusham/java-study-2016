package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserListServlet
 */
@WebServlet("/UserListServlet")
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public UserListServlet() {
		super();
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*ユーザー一覧を保持するリスト*/
		List<User> users = new ArrayList<User>();

		/*久保田を生成*/
		User kubota = new User("Shinya", "Kubota", 25, 0);
		users.add(kubota);
		/*竹下を生成*/
		User takeshita = new User("NYAO", "Takeshita", 26, 1);
		users.add(takeshita);
		/*荒異を生成*/
		User arai = new User("de000", "Arai", 12, 0);
		users.add(arai);

		//JSP参照ように追加
		request.setAttribute("users", users);

		//JPSをよぶ
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jps");
		dispatcher.forward(request,  responce);

	}


	dispatcher.forward(request, response);
}

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
}
}
