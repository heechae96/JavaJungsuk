package ch4;

public class Ch4_15 {
    public static void main(String[] args) {
        // 회문수 : 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수
        // 12321, 13531, ...
        int number = 12321;
        int tmp = number;

        int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

        while (tmp != 0) {
            // 나머지 연산자를 이용
        }

        if(number == result)
            System.out.println(number + "는 회문수");
        else
            System.out.println(number + "는 회문수가 아님");
    }
}
