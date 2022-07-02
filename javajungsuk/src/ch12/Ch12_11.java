package ch12;

import java.util.ArrayList;

public class Ch12_11 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// 애너테이션
		// @SuppressWarnings
		
		NewClass2 nc = new NewClass2();
		
		nc.oldFiled = 10;
		System.out.println(nc.getOldField());
		
		@SuppressWarnings("unchecked")
		ArrayList<NewClass2> list = new ArrayList();	// 타입을 지정하지 않음
		list.add(nc);
	}

}

class NewClass2{
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
