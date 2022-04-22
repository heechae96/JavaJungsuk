package ch02;

public class Ch2_2 {

	public static void main(String[] args) {

		// 두 변수의 값 교환하기
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x:"+x+" y:"+y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:"+x+" y:"+y);		
	}

}
