package ch6;

//class MemberCall{
//    int iv = 10;
//    static int cv = 20;
//
//    int iv2 = cv;
//    static int cv2 = iv;    // 라인A
//
//    static void staticMethod1(){    // 클래스 메서드
//        System.out.println(cv);
//        System.out.println(iv); // 라인B
//    }
//
//    void instanceMethod1(){     // 인스턴스 메서드
//        System.out.println(cv);
//        System.out.println(iv); // 라인C
//    }
//
//    static void staticMethod2(){    // 클래스 메서드
//        staticMethod1();
//        instanceMethod1();  // 라인D
//    }
//
//    void instanceMethod2(){     // 인스턴스 메서드
//        staticMethod1();
//        instanceMethod1();  // 라인E
//    }
//}

public class Ch6_18 {
    public static void main(String[] args) {
        // 다음의 코드를 컴파일하면 에러가 발생
        // 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오

        // 답: 라인B
        //  -> 클래스 메서드에서 인스턴스 변수를 사용할수 없다
        // 답: 라인D
        //  -> 클래스 메서드에서 인스턴스 메서드를 호출할수 없다
    }
}
