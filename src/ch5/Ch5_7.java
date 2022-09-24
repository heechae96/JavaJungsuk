package ch5;

import java.util.Arrays;

public class Ch5_7 {
    public static void main(String[] args) {
        // 5-6에 동전의 개수를 추가한 프로그램
        // 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산
        // 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, '거스름 돈이 부족'라고 출력하고 종료
        // 지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력

        if (args.length != 1) {
            System.out.println("USAGE: java Ch5_7 3170");
            System.exit(0);
        }

        // 문자열을 숫자로 변환
        // 입력한 값이 숫자가 아닐 경우 예외 발생
        int money = Integer.parseInt(args[0]);
        System.out.println("money = " + money);

        int[] coinUnit = {500, 100, 50, 10};    // 동전의 단위
        int[] coin = {5, 5, 5, 5};  // 단위별 동전의 개수

        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;    // 동전의 개수

            // 아래의 로직에 맞게 코드를 작성하시오
            // 1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다
            coinNum = money / coinUnit[i];
//            System.out.println("coinNum :" + coinNum);

            if (coinNum <= coin[i]) { // 충분한 동전이 있는 경우
                // 2. 배열 coin에서 coinNum만큼의 동전을 뺀다
                coin[i] -= coinNum;
//                System.out.print("잔액테스트 : money " + money + "\t");
            } else { // 충분한 동전이 없는 경우
                coinNum = coin[i];
                // 2. 배열 coin에서 coinNum만큼의 동전을 뺀다
                coin[i] -= coinNum;
//                System.out.println("coin: " + coin[i]);
//                System.out.print("잔액테스트 : money " + money + "\t");

            }
            // 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다
            money -= coinNum * coinUnit[i];
//            System.out.println(money);

            System.out.println(coinUnit[i] + "원: " + coinNum);
        }

        if (money > 0) {
            System.out.println("거스름돈이 부족합니다");
            System.exit(0);
        }

        System.out.println(" = 남은 동전의 개수 = ");

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원: " + coin[i]);
        }
    }
}
