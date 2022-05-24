package ch07;

public class Ch7_26 {

	public static void main(String[] args) {

		// 인터페이스의 장점
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine);
	}

}

interface Repairable{}	// 기계화 유닛에 공통점을 부여하기 위해 생성

class Unit1{
	int hitPoint;		// 현재 체력
	final int MAX_HP;	// 최고 체력
	
	Unit1(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit1{
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit1{
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString(){
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString(){
		return "Dropship";
	}

}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	// scv에게 기계화 유닛을 수리할 수 있는 기능을 제공하는 메서드 
	void repair(Repairable r) {
		if(r instanceof Unit1) {
			Unit1 u = (Unit1)r;
//			while(u.hitPoint != u.MAX_HP) {
//				u.hitPoint++;
//			}
			System.out.println(u.toString() + "의 수리 완료");
//			System.out.println(u.MAX_HP);
//			System.out.println(u.hitPoint);
		}
	}
}
