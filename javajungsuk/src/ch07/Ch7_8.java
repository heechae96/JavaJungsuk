package ch07;

public class Ch7_8 {

	public static void main(String[] args) {

		// super() - 조상 클래스의 생성자
		Point3D_3 p3 = new Point3D_3();
		System.out.println("p3.x = "+p3.x);
		System.out.println("p3.y = "+p3.y);
		System.out.println("p3.z = "+p3.z);
		
	}

}

class Point3{
	int x = 10;
	int y = 20;
	
	Point3(int x, int y){
		// 생성자 첫 줄에서 다른 생성자를 호출하지 않기 떄문에
		// 컴파일러가 'super();'를 삽입
		//	-> Object()를 의미
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : "+x+", y : "+y;
	}
}

class Point3D_3 extends Point3{
	
	int z = 30;
	
	Point3D_3(){
		this(100,200,300);
	}
	
	Point3D_3(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
//		return "x : "+x+", y : "+y+", z :"+z;
		return super.getLocation() + ", z :"+z;
	}
}


