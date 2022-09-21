package ch4;

public class Ch4_10 {
    public static void main(String[] args) {
        // 각 자리의 합을 더한 결과를 출력하는 코드
        // 12345 -> 15

        int num = 12345;
        int sum = 0;

        // 문자열로 변환하지 말고 숫자로만 처리해야 한다
//        sum = num / 10000;          // 1
//        sum = num % 10000 / 1000;   // 2
//        sum = num % 1000 / 100;     // 3
//        sum = num % 100 / 10;       // 4
//        sum = num % 10;             // 5
        sum = (num / 10000) + (num % 10000 / 1000)
                + (num % 1000 / 100) + (num % 100 / 10) + (num % 10);


        System.out.println("sum = " + sum);
    }
}
