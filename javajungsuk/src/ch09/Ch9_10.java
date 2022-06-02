package ch09;

final class Card2{
	String kind;
	int num;
	
	Card2(){
		this("SPADE", 1);
	}
	
	Card2(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + " : " + num;
	}
}

public class Ch9_10 {

	public static void main(String[] args) throws Exception{
		//										예외처리 필수

		// Class객체를 얻는법
		Card2 c = new Card2("HEART", 3);		// new 연산자로 객체 생성
		Card2 c2 = Card2.class.newInstance();	// Class객체를 통해서 객체 생성
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
	}

}
