package ch5;

public class Ch5_8 {
    public static void main(String[] args) {
        // 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서
        // 그래프를 그리는 프로그램

        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++) {     // 여기서 카운트
            if (answer[i] == 1) {
                counter[0]++;
            }
            if (answer[i] == 2) {
                counter[1]++;
            }
            if (answer[i] == 3) {
                counter[2]++;
            }
            if (answer[i] == 4) {
                counter[3]++;
            }
        }

        for (int i = 0; i < counter.length; i++) {    // 여기서 출력
            System.out.print(counter[i]);
            System.out.println();
        }
    }
}
