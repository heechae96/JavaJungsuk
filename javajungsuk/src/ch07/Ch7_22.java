package ch07;

class Product22{
	int price;
	int bonusPoint;
	
	Product22(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product22() {}
}

class Tv22 extends Product22{
	Tv22(){
		super(100);
	}
	
	public String toString(){
		return "Tv";
	}
}

class Computer22 extends Product22{
	Computer22(){
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Audio22 extends Product22{
	Audio22(){
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}

class Buyer22{
	int money = 1000;
	int bonusPoint = 0;
	Product22 item[] = new Product22[10];
	int i = 0;
	
	void buy(Product22 p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"을/를 구매");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) {
				break;
			}
			sum += item[i].price;
//			itemList += item[i] + ", ";
			// 깔끔하게 출력되도록 삼항연산자 사용
			itemList += (i==0)? ""+item[i] : ", " + item[i];
		}
		
		System.out.println("구입한 물품의 총액은 " + sum + "만원입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}
}



public class Ch7_22 {

	public static void main(String[] args) {

		// 여러 종류의 객체를 배열로 다루기
		Buyer22 b = new Buyer22();
		
		b.buy(new Tv22());
		b.buy(new Computer22());
		b.buy(new Audio22());
		
		b.buy(new Computer22());
		b.buy(new Computer22());
		b.buy(new Computer22());
		b.buy(new Computer22());
		
		b.summary();
		System.out.println(b.toString());
		
		String a = "abc";
		System.out.println(a.toString());
	}

}
