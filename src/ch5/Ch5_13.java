package ch5;

import java.util.Scanner;

public class Ch5_13 {
    public static void main(String[] args) {
        // 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제

        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();   // String -> char[]

            // char배열 question에 담긴 문자의 위치를 임의로 바꾼다
            for(int j=0; j<question.length; j++){
                char tmp = ' ';
                int random = (int) (Math.random() * question.length);
//                System.out.println(random);

                tmp = question[j];
                question[j] = question[random];
                question[random] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요 > ", i + 1, new String(question));

            String answer = scanner.nextLine();

            // trim으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if (words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.\n\n");
            else
                System.out.printf("틀렸습니다.\n\n");
        }
    }
}
