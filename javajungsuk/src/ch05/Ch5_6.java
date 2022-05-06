package ch05;

public class Ch5_6 {

	public static void main(String[] args) {

		// 배열의 활용
		// 최대값과 최소값
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		
		// 배열의 두 번재 요소부터 읽는것 주의!
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}	
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}
