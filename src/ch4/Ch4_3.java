package ch4;

public class Ch4_3 {
    public static void main(String[] args) {
        // 1+(1+2)+...+(1+2+3+..+10)
        // 1! + 2! + ... + 10!
        int outter = 0;
        int inner = 0;
        int sum = 0;

        for (int i = 10; i > 0; i--) {
            outter += i;
            for (int j = i-1; j > 0; j--) {
                inner += j;
            }
            sum = outter + inner;
            System.out.println("내부합: " + sum);
        }

        System.out.println("sum : " + sum);
    }
}
