package ch6;

public class Ch6_2 {
    public static void main(String[] args) {
        // 6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가
        // 3
        // 1K
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
