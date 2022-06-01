package ch08;

public class Ch8_21 {

	public static void main(String[] args) {

		// 사용자정의 예외 만들기
		
		try {
			startInstall();	// 프로그램 설치에 필요한 준비 시작
			copyFiles();	// 파일 복사
		}catch(SpaceException e) {
			System.out.println("에러메시지 : "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하기 바람");
		}catch(MemoryException me) {
			System.out.println("에러메시지 : "+me.getMessage());
			me.printStackTrace();
			System.out.println("다시 설치하시오");
		}finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족");
	}

	static void copyFiles() {
		// 파일들을 복사하는 코드를 적는다
	}

	static void deleteTempFiles() {
		// 임시파일들을 삭제하는 코드를 적는다
	}

	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다
		return false;
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다
		return true;
	}

}

class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}