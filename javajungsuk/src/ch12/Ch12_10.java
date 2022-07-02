package ch12;

public class Ch12_10 {

	public static void main(String[] args) {

		// 애너테이션
		// Deprecated
		
		NewClass nc = new NewClass();
		
//		nc.newField = 20;
//		System.out.println(nc.getNewField());
		
		nc.oldFiled = 10;
		System.out.println(nc.getOldField());
	}

}

class NewClass{
	int newField;
	
	int getNewField() {
		return newField;
	}
	
	@Deprecated
	int oldFiled;
	
	@Deprecated
	int getOldField() {
		return oldFiled;
	}
}