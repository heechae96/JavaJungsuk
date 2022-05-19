package ch07;

final class Singletone{
	private static Singletone s = new Singletone();
	
	private Singletone() {
		// 상속이 불가하다
	}
	
	public static Singletone getInstance() {
		if(s == null) {
			s = new Singletone();
		}
		return s;
	}
}
public class Ch7_14 {

	public static void main(String[] args) {
		
		// 생성자의 접근 제어자
//		Singletone ss = new Singletone();
//		System.out.println(ss);
		Singletone s = Singletone.getInstance();
		System.out.println(s);
	}
}
