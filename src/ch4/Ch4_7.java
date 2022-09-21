package ch4;

public class Ch4_7 {
    public static void main(String[] args) {
        // Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장
        int value = (int)(Math.random()*6)+1;
        System.out.println("value: " + value);
    }
}
