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
		HttpSession session = request.getSession(true);

		if (session.getAttribute("users") == null) {
			// ユーザー一覧を保持するリスト
			List<User> users = new ArrayList<User>();

			// 本多さんを生成
			User honda = new User("21013", "Hideki", "Honda", 28, 0);
			// 本多さんをリストに追加
			users.add(honda);

			// 三谷さんを生成
			User mitani = new User("21014", "Ryosuke", "Mitani", 27, 0);
			// 三谷さんをリストに追加
			users.add(mitani);

			// 佐藤さんを生成
			User sato = new User("22002", "Shoko", "Sato", 24, 1);
			// 佐藤さんをリストに追加
			users.add(sato);

			session.setAttribute("users", users);
		}

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
