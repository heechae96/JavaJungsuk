package ch7;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // 배열 SutdaCard를 적절히 초기화 하시오
        for (int i = 0; i < cards.length; i++) {
            if (i >= 10) {
                cards[i] = new SutdaCard(i + 1 - 10, false);
            } else {
                cards[i] = new SutdaCard(i + 1, false);
                if (i == 0 || i == 2 || i == 7) {
                    cards[i] = new SutdaCard();
                    cards[i].num = i + 1;
                }
            }
        }
    }

    // 7-2
    // 메서드명: shuffle
    // 기능: 배열 cards에 담긴 카드의 위치를 뒤섞는다(Math.random()사용)
    // 반환타입: 없음
    // 매개변수: 없음
    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int random = (int) (Math.random() * cards.length);
            int tmp = cards[i].num;
            cards[i].num = cards[random].num;
            cards[random].num = tmp;

            // 1,3,8은 그대로 isKwang이 true.

        }
    }

    // 메서드명: pick
    // 기능: 배열 cards에서 지정된 위치의 SutdaCard를 반환한다
    // 반환타입: SutdaCard
    // 매개변수: int index - 위치
    SutdaCard pick(int index) {
        SutdaCard sutdaCard = cards[index];
        return sutdaCard;
    }

    // 메서드명: pick
    // 기능: 배열 cards에서 임의의 위치의 SutdaCard를 반환한다(Math.random()사용)
    // 반환타입: SutdaCard
    // 매개변수: 없음
    SutdaCard pick() {
        int random = (int) (Math.random() * 20);
        SutdaCard sutdaCard = cards[random];
        return sutdaCard;
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Ch7_1 {
    // 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것
    // 섯다카드 20장을 담은 SutdaCard배열을 초기화
    // 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
    // 1,3,8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다
    // 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ", ");
    }

}
