package ch07;

class Card2{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card2(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card2(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}
public class Ch7_12 {

	public static void main(String[] args) {
		
		// final - 마지막의, 변경할 수 없는
		Card2 c = new Card2("HERRT", 10);
//		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}
