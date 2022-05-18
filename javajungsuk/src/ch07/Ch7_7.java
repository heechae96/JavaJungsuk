package ch07;

public class Ch7_7 {

	public static void main(String[] args) {

		// super() - 조상 클래스의 생성자
		Point3D_2 p3 = new Point3D_2(1, 2, 3);
		
		// 결과 확인
		String result = p3.getLocation();
		System.out.println(result);
	}

}

class Point2{
	int x, y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : "+x+", y : "+y;
	}
}

class Point3D_2 extends Point2{
	
	int z;
	
	Point3D_2(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
		return "x : "+x+", y : "+y+", z :"+z;
	}
}

