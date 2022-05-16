package ch06;

public class Ch6_28 {

	static int[] arr = new int [10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
	public static void main(String[] args) {

		// 초기화 블럭
		for(int i=0; i<arr.length; i++){
			System.out.println("arr["+i+"] : "+arr[i]);
		}
	}

}
