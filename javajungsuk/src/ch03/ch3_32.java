package ch03;

public class ch3_32 {

	public static void main(String[] args) {

		// 조건 연산자 ( ? : )
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		System.out.println(absX);
		System.out.println(absY);
		System.out.println(absZ);
		
		signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
		
		System.out.printf("x = %c%d%n", signX, absX);
		System.out.printf("y = %c%d%n", signY, absY);
		System.out.printf("z = %c%d%n", signZ, absZ);
	}

}
