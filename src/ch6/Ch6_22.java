package ch6;

public class Ch6_22 {
    // 다음과 같이 정의된 메서드를 작성하고 테스트 하시오

    // 메서드명 : isNumber
    // 기능 : 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인
    //      모두 숫자로만 이루어져 있으면 true를 반환,
    //      그렇지 않으면 false를 반환
    //      만일 주어진 문자열이 null이거나 빈문자열이 ""이라면 false를 반환
    // 반환타입 : boolean
    // 매개변수 : String str - 검사할 문자열

    // isNumber메서드를 작성하시오
    static boolean isNumber(String str) {
        boolean bool = false;
        char[] ch = str.toCharArray();

        if (ch == null) {
            bool = false;
        } else {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] >= '0' && ch[i] <= '9') {
                    bool = true;
                } else {    // 숫자로 이루어지지 않았거나 공백일 경우
                    bool = false;
                }
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

//        str = " ";
//        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
