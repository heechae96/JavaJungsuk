package ch3;

public class Ch3_7 {
    public static void main(String[] args) {
        // 화씨 -> 섭씨
        // 섭씨 = 5 / 9 * (화씨 - 32)
        // 단, 소수점 셋째자리에서 반올림(Math.round()를 사용 금지)
        // 100 -> 37.78

        // 다시!
        int fahrenheit = 100;
//        float celcius = ((float)(fahrenheit - 32) * 5 / 9); // 37.77778

        System.out.println("Fahrenheit(화씨) : " + fahrenheit);
//        System.out.println("Celcius(섭씨) : " + celcius);
    }
}
