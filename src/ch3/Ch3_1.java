package ch3;

public class Ch3_1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A';   // 65

        // ?    // 틀림
        System.out.println(1 + x << 33);

        // false    // 틀림
        System.out.println(y >= 5 || x < 0 && x > 2);

        // 23
        System.out.println(y += 20 - x++);  // x = 3

        // 5
        System.out.println(x += 2);

        // false
        System.out.println(!('A' <= c && c <= 'Z'));

        // 2
        System.out.println('C' - c);

        // 5
        System.out.println('5' - '0');

        // 66
        System.out.println(c + 1);

        // 66   // 틀림
        System.out.println(++c);

        // 66   // 틀림
        System.out.println(c++);    // c = 67

        // 67   // 틀림
        System.out.println(c);
    }
}
