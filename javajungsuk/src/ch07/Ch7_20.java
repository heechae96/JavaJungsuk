package ch07;

public class Ch7_20 {

	public static void main(String[] args) {

		// 참조변수와 인스턴스의 연결
		Parent5 p = new child5();
		child5 c = new child5();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}

}

class Parent5{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class child5 extends Parent5{
	int x = 200;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}