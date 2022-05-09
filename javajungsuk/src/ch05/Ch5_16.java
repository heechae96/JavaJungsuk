package ch05;

public class Ch5_16 {

	public static void main(String[] args) {

		// 커맨드 라인을 통해 입력받기
		System.out.println("매개변수의 개수: "+args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = \""+args[i]+"\"");
		}
	}

}
