package ch5;

import java.util.Scanner;

public class Ch5_12 {
    public static void main(String[] args) {
        // 예제 5-13을 활용

        // 아래와 같은 결과가 나오도록 하시오
        // Q1. chair의 뜻은? dmlwk
        // 틀렸습니다. 정답은 의자입니다
        // Q2. computer의 뜻은? 컴퓨터
        // 정답입니다
        // Q3. integer의 뜻은? 정수
        // 정답입니다.
        // 전체 3문제 중 2문제 맞추셨습니다.

        String[] words = {"chair", "computer", "integer"};
        String[] questionWords = {"의자", "컴퓨터", "정수"};
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;

        for (int i = 0; i < words.length; i++) {

            System.out.printf("Q%d. %s의 뜻은? ", i + 1, words[i]);
            String answer = scanner.nextLine();

            if (questionWords[i].equals(answer.trim())) {
                System.out.printf("정답입니다\n\n");
                cnt++;
            } else
                System.out.printf("틀렸습니다. 정답은 %s입니다\n\n", questionWords[i]);
        }

        System.out.println("전체 3문제 중 "+cnt+"문제 맞추셨습니");
    }
}
