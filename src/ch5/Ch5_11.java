package ch5;

public class Ch5_11 {
    public static void main(String[] args) {
        // 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
        // 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램

        int[][] score = {   // 5,3행렬
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        int[][] result = new int[score.length + 1][score[0].length + 1];    //6,4행렬

        // score -> result
        for (int i = 0; i < score.length; i++) {  // 5
            for (int j = 0; j < score[i].length; j++) {   // 3
                result[i][j] = score[i][j];
                // 마지막 열
                result[i][score[0].length] += score[i][j];
                // 마지막 행(3열까지)
                result[score.length][j] += score[i][j];
                // 마지막 행, 마지막 열
                result[score.length][score[0].length] += score[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) { // 출력
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}
