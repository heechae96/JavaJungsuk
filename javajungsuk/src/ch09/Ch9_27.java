package ch09;

import java.util.Random;

public class Ch9_27 {

	public static void main(String[] args) {

		// Random클래스의 생성자와 메서드
		
		Random rand = new Random(1);
		Random rand2 = new Random(1);
		
		System.out.println("= rand =");
		for(int i=0; i<5; i++)
			System.out.println(i + " : " + rand.nextInt());
		
		System.out.println();
		System.out.println("= rand2 =");
		for(int i=0; i<5; i++)
			System.out.println(i + " : " + rand2.nextInt());
		
	}

}
