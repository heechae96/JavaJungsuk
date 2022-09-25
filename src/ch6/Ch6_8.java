package ch6;

class PlayingCard{
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int k, int n){
        kind = k;
        num = n;
    }

}

public class Ch6_8 {
    public static void main(String[] args) {
        // 변수들을 종류별로 구분해서 적으시오
        // 클래스변수(static변수) : width, height
        // 인스턴스변수 : kind, num
        // 지역변수 : k, n

        PlayingCard card = new PlayingCard(1,1);
    }
}
