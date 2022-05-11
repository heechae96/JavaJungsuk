package ch06;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
public class Ch6_5 {

	public static void main(String[] args) {

		// 클래스 변수와 인스턴스 변수
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		// Card.width, c1.width, c2.width는 모두 같은 저장공간을 참조하므로 같은값
		// 클래스 변수를 인스턴스 변수로 오해하기 쉽기 때문에 Card.width로 쓰는게 좋다
		System.out.println("c1은 "+c1.kind+", "+c1.number+ "이며, 크기는 ("
											+ c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+ "이며, 크기는 ("
											+ c2.width+", "+c2.height+")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+ "이며, 크기는 ("
											+ c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+ "이며, 크기는 ("
											+ c2.width+", "+c2.height+")");

	}

}
