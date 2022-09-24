package ch6;

public class Ch6_1 {
    public static void main(String[] args) {
        // 다음과 같은 멤버변수를 갖는 StudentCard클래스를 정의
        // int      num     카드의 숫자(1~10사이의 정수)
        // boolean  isKwang 광이면 true, 아니면 false
    }
}
// 6-1
//class SutdaCard {
//    int num;
//    boolean isKwang;
//}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    SutdaCard() {
        this(1, true);
    }

    String info() {
        return isKwang==true ? num+"K" : String.valueOf(num);
    }
}
