package ch02;

public class Ch2_3 {

	public static void main(String[] args) {

		// 문자 리터럴과 문자열 리터럴
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		// 연산은 좌측에서 우측으로
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+" ");
		System.out.println(7+"");
		System.out.println(" "+7);
		System.out.println(""+7);
		System.out.println(""+"");
		System.out.println(7+7+"");
		System.out.println(""+7+7);
	}

}
