package ch7;

class MyTv2{
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel;    // 이전 채널

    final int MAX_VOLUME = 100;
    final int MIN_VOLUNE = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // 알맞은 코드를 넣어 완성하시오
    int getChannel(){
        return channel;
    }

    int getVolume(){
        return volume;
    }

    void setChannel(int channel){
        prevChannel = getChannel();
        this.channel = channel;
    }

    void setVolume(int volume){
        this.volume = volume;
    }

    // 7-11
    // 메서드명: gotoPrevChannel
    // 기능: 현재 채널을 이전 채널로 변경
    // 반환타입: 없음
    // 매개변수: 없음
    // 힌트. 이전 채널의 값을 저장할 멤버변수를 정의
    void gotoPrevChannel(){
        setChannel(prevChannel);
    }

}

public class Ch7_10 {
    // MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록
    // 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
    // getter와 setter메서드를 추가하라

    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL: " + t.getVolume());
    }
}
