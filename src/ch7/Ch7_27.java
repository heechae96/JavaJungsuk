//package ch7;
//
//class Outer {
//    int value = 10;
//
//    class Inner {
//        int value = 20;
//
//        void method1() {
//            int value = 30;
//
//            // 1)
//            System.out.println(value);
//            // 2)
//            System.out.println(this.value);
//            // 3)
//            System.out.println(Outer.this.value);
//        }
//    }
//}
//
//public class Ch7_27 {
//    // 다음과 같은 실행결과를 얻도록 (1) ~ (4)의 코드를 완성하시오
//
//    // 실행결과
//    // 30
//    // 20
//    // 10
//
//    public static void main(String[] args) {
//        // 4)
//
//
////        inner.method1();
//    }
//}
