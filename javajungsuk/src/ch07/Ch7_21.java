package ch07;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv11 extends Product{
	Tv11(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer11 extends Product{
	Computer11(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {	// 매개변수의 다형성
		if(money < p.price) {
			System.out.println("돈이 부족합니다");
			return;			// 메소드 종료
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구매하였습니다");
	}
}
public class Ch7_21 {

	public static void main(String[] args) {

		// 매개변수의 다형성
		Buyer b = new Buyer();
		
		b.buy(new Tv11());
		b.buy(new Computer11());
		
		b.buy(new Computer11());
		b.buy(new Computer11());
		b.buy(new Computer11());
		b.buy(new Computer11());
		
		System.out.println("현재 남은 돈은 " +b.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다");
	}

}
