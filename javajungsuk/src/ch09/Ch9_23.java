package ch09;

public class Ch9_23 {

	public static void main(String[] args) {

		// 래퍼 클래스
		
		Integer i = new Integer(100);
		Integer i2 = new Integer("100");
		
		System.out.println("i==i2 ? " + (i==i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
		// 같으면 0, 비교대상보다 크면 1, 비교대상보다 작으면 -1
		System.out.println("i.compateTo(i2) = " + i.compareTo(i2));	
		System.out.println("i.toString() = " + i.toString());
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + " bits");
		System.out.println("BYTES = " + Integer.BYTES + " bytes");
		System.out.println("TYPE = " + Integer.TYPE);
	}

}
