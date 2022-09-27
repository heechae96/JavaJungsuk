package ch7;

class SutdaCard2{
    final int num;
    final boolean isKwang;

    SutdaCard2(){
        this(1,true);
    }

    SutdaCard2(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K" : "");
    }

}
public class Ch7_14 {
    // 문제 7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는 사실 한번 값이 지정되면
    // 변경되어서는 안되는 값이다.
    // 카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이 될 수 도 있기 때문
    // 이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하시오

    public static void main(String[] args) {
        SutdaCard card = new SutdaCard(1, true);
    }
}
