package ch05;

public class Ch5_12 {

	public static void main(String[] args) {

		// String배열의 초기화
		String[] names = {"Shin", "Hee", "chae"};
		
		for(int i=0; i<names.length; i++)
			System.out.println("names["+i+"]: "+names[i]);
		
		String tmp = names[2];
		System.out.println("tmp: "+tmp);
		names[0] = "Lim";
		
		// 향상된 for
		for(String name : names)
			System.out.println(name);
		
		
	}

}
