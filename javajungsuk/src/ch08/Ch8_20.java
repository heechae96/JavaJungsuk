package ch08;

public class Ch8_20 {

	public static void main(String[] args) {

		// 자동 자원 반환 - try-with-resources문
		
		try(CloseableResourece cr = new CloseableResourece()){
			cr.exceptionWork(false);	// 예외가 발생x
		}catch(WorkException e) {
			e.printStackTrace();
		}catch(CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try(CloseableResourece cr = new CloseableResourece()){
			cr.exceptionWork(true);		// 예외가 발생
		}catch(WorkException e) {
			e.printStackTrace();
		}catch(CloseException e) {
			e.printStackTrace();
		}
		
	}

}

class CloseableResourece implements AutoCloseable{
	public void exceptionWork(boolean exception) throws WorkException{
		System.out.println("exceptionWork("+exception+")가 호출됨");
		
		if(exception) {
			throw new WorkException("WorkException발생!!!");
		}
	}
	
	public void close() throws CloseException{
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException발생!!!");
	}
}

class WorkException extends Exception{
	WorkException(String msg){
		super(msg);
	}
}

class CloseException extends Exception{
	CloseException(String msg){
		super(msg);
	}
}