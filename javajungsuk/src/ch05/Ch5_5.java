package ch05;

public class Ch5_5 {

	public static void main(String[] args) {

		// 배열의 활용
		// 총합과 평균
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
//		average = sum / score.length;			// 결과 다름 주의!
		average = sum / (float)score.length;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);
		
	}

}
