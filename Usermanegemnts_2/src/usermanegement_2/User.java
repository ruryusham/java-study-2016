/**
 *
 */
/**
 * @author k.okano
 *
 */
package usermanegement_2;

public class User {



	public User(String userid,String firstname, String lastname, int age, int sex){

		this.userid    = userid;
		this.firstname = firstname;
		this.lastname  = lastname;
		this.age       = age;
		this.sex       = sex;

	}


	//ユーザID

	private String userid;

	/*名前*/
	private String firstname;


	/*苗字*/
	private String lastname;

	/*年齢*/
	private int age;

	/*性別*/
	private int sex;

	//ユーザIDを追加
	public String getUserid() {
		return userid;
	}

	//ユーザIDを渡す
	public void setUserid(String userid) {
		this.userid = userid;
	}

    //名前を取得
	public String getFirstname() {
		return firstname;
	}

	/*名前を渡す*/
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/*苗字を取得*/
	public String getLastname(){
		return lastname;
	}

	/*苗字を渡す*/
	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	/*年齢を取得*/
	public int getAge(){
		return age;
	}

	/*年齢を渡す*/
	public void setAge(int age){
		this.age = age;

	}

	/*性別を取得*/
	public int getSex(){
		return sex;
	}

	/*性別を渡す*/
	public void setSex(int sex){
		this.sex = sex;
	}

}