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
import javax.servlet.http.HttpSession;

import bean.User;

/**
 * Servlet implementation class UserCreateServlet
 */
@WebServlet("/UserCreateServlet")
public class UserCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserCreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JSPを呼び出す
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-create.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// セッションから登録済みのユーザー一覧を取得
		HttpSession session = request.getSession(true);
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) session.getAttribute("users");
		if (users == null) {
			users = new ArrayList<User>();
		}

		// TODO あとで入力値チェックを実装する。

		// 入力値の取得
		String UserId = request.getParameter("UserId");
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		int Age = Integer.parseInt(request.getParameter("Age"));
		int Sex = Integer.parseInt(request.getParameter("Sex"));
		String AlmaMater = request.getParameter("AlmaMater");

		// 新規ユーザーを生成
		User newUser = new User(UserId, FirstName, LastName, Age, Sex, AlmaMater);
		// 新規ユーザーをリストに追加
		users.add(newUser);

		// セッションにユーザー一覧を設定
		session.setAttribute("users", users);

		response.sendRedirect("user-list");
	}
}
