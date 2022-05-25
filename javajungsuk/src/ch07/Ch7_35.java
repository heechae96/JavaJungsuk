package ch07;

class Outer2{
	int value = 10;
	
	class Inner{
		int value = 20;
		
		void method1() {
			int value = 30;
			System.out.println("		   value :"+value);
			System.out.println("	  this.value :"+this.value);
			System.out.println("Outer.this.value :"+Outer2.this.value);
		}
	}
}

public class Ch7_35 {

	public static void main(String[] args) {

		// 내부 클래스의 제어자와 접근성
		Outer2 outer = new Outer2();
		Outer2.Inner inner = outer.new Inner();
		inner.method1();
	}

}
