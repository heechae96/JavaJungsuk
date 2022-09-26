package ch7;

public class Ch7_2 {
    // 문제 7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오
    // 주의. Math.random()을 사용하는 경우 실행결과와 다를 수 있음

    public static void main(String[] args) {

        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++)
            System.out.print(deck.cards[i]+", ");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
