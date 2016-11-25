package bean;

/**
 * ユーザーの情報を保持するクラスです。
 */
public class User {
	/**
	 * コンストラクタ
	 *
	 * @param userId ユーザーID
	 * @param firstName 名前
	 * @param lastName 苗字
	 * @param age 年齢
	 * @param sex 性別
	 */
	public User(String userId, String firstName, String lastName, int age, int sex) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}

	/**
	 * ユーザーID
	 */
	private String userId;

	/**
	 * 名前
	 */
	private String firstName;

	/**
	 * 苗字
	 */
	private String lastName;

	/**
	 * 年齢
	 */
	private int age;

	/**
	 * 性別
	 */
	private int sex;

	/**
	 * ユーザーIDを取得します。
	 *
	 * @return ユーザーID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを設定します。
	 *
	 * @param userId ユーザーID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 名前を取得します。
	 *
	 * @return 名前
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 名前を設定します。
	 *
	 * @param firstName 名前
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 苗字を取得します。
	 *
	 * @return 苗字
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 苗字を設定します。
	 *
	 * @param lastName 苗字
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 年齢を取得します。
	 *
	 * @return 年齢
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 年齢を設定します。
	 *
	 * @param age 年齢
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 性別を取得します。
	 *
	 * @return 性別
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * 性別を設定します。
	 *
	 * @param sex 性別
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
}
