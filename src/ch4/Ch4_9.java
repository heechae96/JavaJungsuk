package ch4;

public class Ch4_9 {
    public static void main(String[] args) {
        // 각 자리의 합을 더한 결과를 출력하는 코드
        // 12345 -> 15

        String str = "12345";
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            // String클래스의 charAt(int i)를 사용
            char ch = str.charAt(i);
//            System.out.println(ch);
            sum += (int)ch - 48;
        }
        System.out.println("sum = " + sum);
    }
}
