package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;

/**
 * Servlet implementation class UserListServlet
 */
@WebServlet("/UserListServlet")
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserListServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ユーザー一覧を保持するリスト
		List<User> users = new ArrayList<User>();

		// 本多さんを生成
		User honda = new User("Hideki", "Honda", 28, 0);
		// 本多さんをリストに追加
		users.add(honda);

		// 三谷さんを生成
		User mitani = new User("Ryosuke", "Mitani", 27, 0);
		// 三谷さんをリストに追加
		users.add(mitani);

		// 佐藤さんを生成
		User sato = new User("Shoko", "Sato", 24, 1);
		// 佐藤さんをリストに追加
		users.add(sato);

		// JSPで参照できるようにAttributeに追加
		request.setAttribute("users", users);

		// JSPを呼び出す
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}