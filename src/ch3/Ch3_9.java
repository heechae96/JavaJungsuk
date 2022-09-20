package ch3;

public class Ch3_9 {
    public static void main(String[] args) {
        // 문자형 변수 ch가 영문자이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드
        char ch = 'z';
        // 영문자일 경우 다시 생각!!
        boolean b =  ch >= (int)'a' && ch >= (int)'Z' ? true : false;
        // 숫자는?!

        System.out.println(b);
    }
}
