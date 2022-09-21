package ch4;

public class Ch4_1 {
    public static void main(String[] args) {
        // 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
        int a = 15;
        if(a>10 && a<20){
            System.out.println("true");
        }

        // 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        char ch2= ' ';
        if(ch2 != ' ' || ch2 != '\t'){
            System.out.println("true2");
        }

        // 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
        char ch3 = 'x';
        if(ch3 == 'x' || ch3 == 'X'){
            System.out.println("true3");
        }

        // 4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
        char ch4= '5';
        if(ch4 >= '0' && ch4 <= '9'){
            System.out.println("true4");
        }

        // 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        char ch5 = 'x';
        if((ch5 >= 'a' && ch5 <= 'z') || (ch5 >= 'A' && ch5 <= 'Z')){
            System.out.println("true5");
        }

        // 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고
        // 100으로 나눠떨어지지 않을 때 true인 조건식
        int b = 440;
        if((b%400 == 0 || b%4 == 0) && b%100 != 0){
            System.out.println("true6");
        }

        // 7. boolean형 변수 powerOn가 false일 때 true인 조건식
        boolean powerOn = false;
        if(powerOn == false){
            System.out.println("true7");
        }

        // 8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
        String str = "yes";
        if(str == "yes"){
            System.out.println("true8");
        }
    }
}
