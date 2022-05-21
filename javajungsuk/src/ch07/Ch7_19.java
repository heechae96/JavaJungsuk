package ch07;

public class Ch7_19 {

	public static void main(String[] args) {

		// 참조변수와 인스턴스의 연결
		Parent4 p = new child4();
		child4 c = new child4();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}

}

class Parent4{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class child4 extends Parent4{}


