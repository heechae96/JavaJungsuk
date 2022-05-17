package ch07;

class Tv{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
public class Ch7_1 {

	public static void main(String[] args) {

		// 상속의 정의와 장점
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		System.out.println("caption상태: "+ctv.caption); 
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
		System.out.println("caption상태: "+ctv.caption);
	}

}
