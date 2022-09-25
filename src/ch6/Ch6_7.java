package ch6;

class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 인스턴스 메서드 getDistance를 작성하시오
    double getDistance(int x, int y) {
        // 제곱근 계산은 Math.sqrt(double a)를 사용

//        return Math.sqrt( - x) + Math.sqrt( - y);
    return 0;
    }

}

public class Ch6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        // p와 (2,2)의 거리를 구한다
        System.out.println(p.getDistance(2, 2));
    }
}
