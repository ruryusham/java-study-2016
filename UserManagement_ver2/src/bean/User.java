/**
 *
 */
/**
 * @author k.okano
 *
 */
package bean;


public class User {

	/** User_Id ユーザID
	 *  First_Name 氏名
	 *  Last_Name 苗字
	 *  Age 年齢
	 *  Sex 性別
	 *  Alma_Mater 出身校
	 **/

	public User(String User_Id , String First_Name , String Last_Name , int Age , int Sex , String Alma_Mater){
		this.UserId = User_Id;
		this.FirstName = First_Name;
		this.LastName = Last_Name;
		this.Age = Age;
		this.Sex = Sex;
		this.AlmaMater = Alma_Mater;
	}

	/**
	 * ユーザID
	 */

	private String UserId;

	/**
	 * 氏名
	 */

	private String FirstName;

	/**
	 * 苗字
	 */

	private String LastName;

	/**
	 * 年齢
	 */

	private int Age;

	/**
	 * 性別
	 */

	private int Sex;

	/**
	 * 出身校
	 */

	private String AlmaMater;

	/**
	 * ユーザIDを取得する
	 */

	public String getUserId(){
		return UserId;
	}

	/**
	 * ユーザIDを設定する。
	 * @param User_Id
	 */

	public void setUserId(String User_Id){
		this.UserId = User_Id;
	}
	/**
	 * 名前を取得する
	 */

	public String getFirstName(){
		return FirstName;
	}

	/**
	 * 名前を設定する。
	 * @param Last_Name
	 */

	public void setFirstName(String First_Name){
		this.FirstName = First_Name;
	}

	/**
	 * 苗字を取得する
	 */

	public String getLastName(){
		return LastName;
	}

	/**
	 * 苗字を設定する。
	 * @param Last_Name
	 */

	public void setLastName(String Last_Name){
		this.LastName = Last_Name;
	}

	/**
	 * 年齢を取得する
	 */

	public int getAge(){
		return Age;
	}

	/**
	 * 年齢を設定する。
	 * @param Age
	 */

	public void setAge(int Age){
		this.Age = Age;
	}

	/**
	 * 性別を取得する
	 */

	public int getSex(){
		return Sex;
	}

	/**
	 * 性別を設定する。
	 * @param Sex
	 */

	public void setSex(int Sex){
		this.Sex = Sex;
	}

	/**
	 * 出身校を取得する
	 */

	public String getAlmaMater(){
		return AlmaMater;
	}

	/**
	 * 出身校を設定する。
	 * @param Alma_Mater
	 */

	public void setAlmaMater(String Alma_Mater){
		this.AlmaMater = Alma_Mater;
	}

}