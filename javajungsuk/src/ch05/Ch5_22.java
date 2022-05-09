package ch05;

public class Ch5_22 {

	public static void main(String[] args) {

		// 다차원 배열의 활용
		// 행렬의 곱셈
		int[][] m1 = {
						{1, 2, 3},
						{4, 5, 6}
					};
		
		int[][] m2 = {
						{1, 2},
						{3, 4},
						{5, 6}
					};
		
		final int ROW = m1.length;		// m1의 행 : 2
		final int COL = m2[0].length;	// m2의 열 : 2
		final int M2_ROW = m2.length;	// m2의 행 : 3
		
		int[][] m3 = new int[ROW][COL];
		
		for(int i=0; i<ROW; i++)
			for(int j=0; j<COL; j++)
				for(int k=0; k<M2_ROW; k++)
					m3[i][j] += m1[i][k] * m2[k][j];
		
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
