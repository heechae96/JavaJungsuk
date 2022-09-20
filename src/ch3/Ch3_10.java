package ch3;

public class Ch3_10 {
    public static void main(String[] args) {
        // 대문자를 소문자로 변경하는 코드
        // 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경

        // ch : A
        // ch to lowerCase : a

        char ch = 'A';

        char lowerCase = (ch >= 'A' && ch <= 'Z')? (char)(ch+32) : ch;

        System.out.println("ch : " + ch);
        System.out.println("ch to lowerCase : " + lowerCase);
    }
}
