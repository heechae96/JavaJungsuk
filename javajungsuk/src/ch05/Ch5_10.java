package ch05;

public class Ch5_10 {

	public static void main(String[] args) {

		// 배열의 활용
		// 정렬하기(sort)
		int[] numArr = new int[10];
		
		System.out.println("정렬전");
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println("\n정렬후");
		
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false;
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}
			}
			
			// 자리바꿈이 없으면 반복문 탈출
			if(!changed) break;
			
			// 정렬된 결과를 출력
			for(int k=0; k<numArr.length; k++)
				System.out.print(numArr[k]);

			System.out.println();
			
		}
	}

}
