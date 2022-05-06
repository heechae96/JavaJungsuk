package ch05;

public class Ch5_7 {

	public static void main(String[] args) {

		// 배열의 활용
		// 섞기(shuffle)
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;	// 초기화
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		// 100번 섞기
		for(int i=0; i<100; i++) {
			// 0~9의 난수값
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print  (numArr[i]);
		}
	}

}
