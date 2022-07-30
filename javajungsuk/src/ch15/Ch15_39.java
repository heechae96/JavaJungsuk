package ch15;

public class Ch15_39 {

	public static void main(String[] args) {

		// 직렬화가 가능한 클래스 만들기 - Serializable, transient
		
	}

}

class UserInfo implements java.io.Serializable{
	String name;
	String password;
	int age;
	
	public UserInfo() {
		this("Unknown", "1111", 0);
	}
	
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public String toString() {
		return "(" + name + "," + password + age + ")";
	}
	
}
