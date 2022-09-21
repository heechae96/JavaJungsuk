package ch4;

public class Ch4_13 {
    public static void main(String[] args) {
        // 주어진 문자열(value)이 숫자인지를 판별

        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        // 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사
        for(int i=0; i<value.length(); i++){
            ch = value.charAt(i);
//            System.out.println(ch);
            if(!(ch >= '1' && ch <= '9')){
                isNumber = false;
            }
//            System.out.println(isNumber);
        }

        if(isNumber){
            System.out.println(value + "는 숫자");
        }else{
            System.out.println(value + "는 숫자가 아님");
        }
    }
}
