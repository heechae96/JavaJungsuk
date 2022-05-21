package ch07;

public class ch7_18 {

	public static void main(String[] args) {
		
		// 참조변수와 인스턴스의 연결
		Parent3 p = new child3();
		child3 c = new child3();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}

}

class Parent3{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class child3 extends Parent3{
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}
