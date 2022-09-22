package ch5;

public class Ch5_9 {
    public static void main(String[] args) {
        // 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램

        char[][] star = {   // 4,5
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };

        char[][] result = new char[star[0].length][star.length];    // 5,4

        // star
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // star -> result
        for (int i = 0; i < star.length; i++) { // 4번
            for (int j = 0; j < star[i].length; j++) {  // 5번
                if(i==j){
                    // ?
                }
                if(i>2){
                    result[j][i] = star[i][j];
                }
            }
        }

        // result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
