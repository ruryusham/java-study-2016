package mysql;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import bean.User;

/**
 * MySQL接続クラス
 */
public final class ConnectionClass {
	/**
	 * 接続先情報
	 */
	static final String URL = "jdbc:mysql://192.168.85.113:3306/java-study-honda?useSSL=false";
	/**
	 * ユーザー名
	 */
	static final String USERNAME = "ICSP";
	/**
	 * パスワード
	 */
	static final String PASSWORD = "ICSP";

	/**
	 * 全ユーザー情報を取得します。
	 *
	 * @return 全ユーザー情報
	 */
	public static List<User> select() {
		try (
			Connection connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement statement = (Statement) connection.createStatement();
		) {
			// SQL生成
			String sql = "SELECT * FROM t_user;";
			System.out.println(sql);

			// SQL実行
			ResultSet rs = statement.executeQuery(sql);

			// 取得結果をユーザー型へ変換
			List<User> result = new ArrayList<User>();
			while(rs.next()){
				String userId = rs.getString("USER_ID");
				String firstName = rs.getString("FIRST_NAME");
				String lastName = rs.getString("LAST_NAME");
				int age = rs.getInt("AGE");
				int sex = rs.getInt("SEX");
				User user = new User(userId, firstName, lastName, age, sex);
				result.add(user);
			}

			return result;
		} catch (SQLException e) {
			// DB接続時にエラーが発生
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * ユーザーを登録します。
	 *
	 * @param user 登録するユーザー情報
	 */
	public static void insert(User user) {
		try (
			Connection connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement statement = (Statement) connection.createStatement();
		) {
			// SQL生成
			String sql = "INSERT INTO t_user VALUES ('"
				+ user.getUserId() + "', '"
				+ user.getFirstName() + "', '"
				+ user.getLastName() + "', "
				+ user.getAge()
				+ ", 0, 0, 0, 0);";
			System.out.println(sql);

			// SQL実行
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}