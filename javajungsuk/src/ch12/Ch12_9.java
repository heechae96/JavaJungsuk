package ch12;

public class Ch12_9 {
	
	public static void main(String[] args) {
		
		// 애너테이션
		// @Override
		
	}

}

class Parent{
	void parentMethod() {}
}

class Child extends Parent{
	@Override
	void parentMethod() {}
//	void parentmethod() {}
}
