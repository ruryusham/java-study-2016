/**
 *
 */
/**
 * @author k.okano
 *
 */
package UserListServlet;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import usermanegement_2.User;


@WebServlet("/UserListServlet")

public class UserListServlet extends HttpServlet{
	private static final long SerialVersionUID = 1L;

	public UserListServlet(){
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

		/*ユーザリストを保持*/
		List<User> Users = new ArrayList<User>();


		/*本多さん作成*/
		User honda = new User("00001","Hideki","Honda",28,0);

		/*本多さんをリストに追加*/
		Users.add(honda);

		/*川村さん作成*/
		User kawamura = new User("00002","Yugo","Kawamura",24,0);

		/*川村さんをリストに追加*/
		Users.add(kawamura);

		/*三谷さん作成*/
		User mitani = new User("00003","Ryosuke","Mitani",27,0);

		/*三谷さんをリストに追加*/
		Users.add(mitani);

		request.setAttribute("users",Users);

		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

