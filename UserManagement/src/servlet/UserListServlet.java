package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import mysql.ConnectionClass;

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
		// DBから全ユーザー情報を取得
		List<User> users = ConnectionClass.select();

		// 取得したユーザー情報をセッションに設定
		HttpSession session = request.getSession(true);
		session.setAttribute("users", users);

		// JSPを呼び出す
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 削除するユーザーのユーザーIDを取得
		String userId = request.getParameter("userId");

		// セッションからユーザー一覧を取得
		HttpSession session = request.getSession(true);
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) session.getAttribute("users");

		int index = -1;
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getUserId().equals(userId)) {
				index = i;
				break;
			}
		}

		// ユーザーの削除
		users.remove(index);

		// セッションにユーザー一覧を設定
		session.setAttribute("users", users);

		doGet(request, response);
	}
}
