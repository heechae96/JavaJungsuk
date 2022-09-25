package ch6;

public class Ch6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        // 제곱근 계산은 Math.sqrt(double a)를 사용
        int i = y1 - y; // 1
        int j = x1 - x; // 1
        return Math.sqrt(i*i + j*j);
    }

    public static void main(String[] args) {
        // 두 점의 거리를 계산하는 getDistance()를 완성

        System.out.println(getDistance(1, 1, 2, 2));
    }

}
