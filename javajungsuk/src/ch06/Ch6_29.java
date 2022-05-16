package ch06;

class Product{
	static int count = 0;	// 생성된 인스턴스의 수를 저장하기 위한 변수
//	int count = 0;			// serialNo가 항상 1이 찍힘. 인스턴스가 생성될 때마다 0으로.
	int serialNo;
	
	{
		++count;
		serialNo = count;
	}
	
	public Product() {}	// 기본생성자, 생략가능
}

public class Ch6_29 {

	public static void main(String[] args) {

		// 멤버변수의 초기화 시기와 순서
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다.");
	}

}

