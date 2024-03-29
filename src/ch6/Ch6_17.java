package ch6;

public class Ch6_17 {
    public static void main(String[] args) {
        // 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
        // println
        // method1
        // method2
        // main

        // a. 제일 먼저 호출스택에 저장된 것은 main메서드이다
        // b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다
        // c. method2메서드를 호출한 것은 main메서드이다
        // d. println메서드가 종료되면 method1메서드가 수행을 재개한다
        // e. main - method2 - method1 - println의 순서로 호출되었다
        // f. 현재 실행중인 메서드는 println뿐이다

        // 답: b
        //  -> 종료된것이 아님. 대기 상태임.
        // 답: f
        //  -> 나머지 메서드들도 실행대기 상태임.
    }
}
