package ch3;

public class Ch3_3 {
    public static void main(String[] args) {
        int num = 10;
        // 삼항연산자를 2번 사용
        System.out.println(num > 0 ? "양수" : (num == 0 ? 0 : "음수"));
    }
}
