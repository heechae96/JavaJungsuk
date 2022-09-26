package ch7;

public class Ch7_11 {
    // 문제 7-10에서 작성한 MyTv2클래스에 이전 채널로 이동하는 기능의 메서드를 추가해서
    // 실행결과와 같은 결과를 얻도록 하시오
    // 힌트. 이전 채널의 값을 저장할 멤버변수를 정의하라

    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
    }
}
