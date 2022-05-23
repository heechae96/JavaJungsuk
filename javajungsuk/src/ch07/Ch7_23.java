package ch07;

import java.util.Vector;

class Product33{
	int price;
	int bonusPoint;
	
	Product33(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product33() {}
}

class Tv33 extends Product33{
	Tv33(){
		super(100);
	}
	
	public String toString(){
		return "Tv";
	}
}

class Computer33 extends Product33{
	Computer33(){
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Audio33 extends Product33{
	Audio33(){
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}

class Buyer33{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	int i = 0;
	
	void buy(Product33 p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"을/를 구매");
	}
	
	void refund(Product33 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을/를 반품");
		}else {
			// 제거에 실패한 경우
			System.out.println("구입한 제품중 해당 제품이 없음");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {	// vector가 비어있는지 확인
			System.out.println("구입한 제품이 없음");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			// vector i번째에 있는 객체 얻기
			// Object타입이므로 적절한 타입으로 형변환 필요
			Product33 p = (Product33)item.get(i);	
			sum += p.price;
			// 깔끔하게 출력되도록 삼항연산자 사용
			itemList += (i==0)? "" + p : ", " + p;
		}
		
		System.out.println("구입한 물품의 총액은 " + sum + "만원입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}
}

public class Ch7_23 {

	public static void main(String[] args) {

		// 여러 종류의 객체를 배열로 다루기
		Buyer33 b = new Buyer33();
		Tv33 tv = new Tv33();
		Computer33 com = new Computer33();
		Audio33 audio = new Audio33();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println("-----------------------------------");
		b.refund(com);
		b.refund(com);
		b.summary();
	}

}
