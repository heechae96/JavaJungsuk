package ch12;

enum Transportation{
	BUS(100){
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	TRAIN(150){
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	SHIP(100){
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	AIRPLAIN(300){
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	};
	
	// protected로 해야 각 상수에 접근가능
	protected final int BASIC_FARE;
	
	// private Transportation(int basicFare){
	Transportation(int basicFare) {
		BASIC_FARE = basicFare;
	}
	
	// 거리에 따른 요금 계산
	abstract int fare(int distance);
}

public class Ch12_7 {

	public static void main(String[] args) {

		// 열거형에 추상 메서드 추가하기
		
		System.out.println("bus fare = " + Transportation.BUS.fare(100));
		System.out.println("train fare = " + Transportation.TRAIN.fare(100));
		System.out.println("ship fare = " + Transportation.SHIP.fare(100));
		System.out.println("airplane fare = " + Transportation.AIRPLAIN.fare(100));
	}

}
