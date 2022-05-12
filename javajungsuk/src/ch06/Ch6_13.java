package ch06;

public class Ch6_13 {

	public static void main(String[] args) {

		// 기본형 매개변수와 참조형 매개변수
		Ch6_13 r = new Ch6_13();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3, 5, result2);
		System.out.println(result2[0]);
		
	}

	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}
}
