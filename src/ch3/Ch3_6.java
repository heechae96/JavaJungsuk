package ch3;

public class Ch3_6 {
    public static void main(String[] args) {
        // num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지 구하는 코드
        // 24 -> 6
        // 나머지 연산자 이용
        int num = 24;
        // 좀 더 쉬운 방법을 찾아보자!
        System.out.println((num / 10 + 1) * 10 -num);
    }
}
