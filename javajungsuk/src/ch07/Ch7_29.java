package ch07;

class A3{
	void methodA(){
		I3 i = InstanceManager.getInstance();
		i.methodB();
		// 모든 객체는 Object클래스에 정의된 메서드를 가지고 있을 것이기 때문에 허용
		//	-> new B3()
		System.out.println(i.toString());
		System.out.println(i);
	}
}

interface I3{
	void methodB();
}

class B3 implements I3{
	public void methodB() {
		System.out.println("methodB in B class");
	}
	public String toString() {
		return "class B";
	}
}

class InstanceManager{
	public static I3 getInstance() {
		return new B3();
	}
}
public class Ch7_29 {

	public static void main(String[] args) {

		// 인터페이스의 이해(제3의 클래스를 통해 제공 받기)
		A3 a = new A3();
		a.methodA();
	}

}
