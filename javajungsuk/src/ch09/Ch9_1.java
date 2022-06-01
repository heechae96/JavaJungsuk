package ch09;

public class Ch9_1 {

	public static void main(String[] args) {
		
		// equals(Object obj)
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같다");
		else
			System.out.println("v1과 v2는 다름");
		
		v2 = v1;
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같다");
		else
			System.out.println("v1과 v2는 다름");
		
	}
}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
}
