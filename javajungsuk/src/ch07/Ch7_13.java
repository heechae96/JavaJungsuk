package ch07;

public class Ch7_13 {

	public static void main(String[] args) {

		// 접근 제어자를 이용한 캡슐화
		Time t = new Time(12, 23, 34);
		System.out.printf("변경전-> "+t);
		System.out.println();
//		t.hour = 13;	// 제어자가 private라 에러!
		
		t.setHour(t.getHour()+11);
		t.setMinute(t.getMinute()+11);
		t.setSecond(t.getSecond()+11);
		System.out.printf("변경후-> "+t);
		System.out.println();
		
		t.setHour(t.getHour()+55);
		t.setMinute(t.getMinute()+55);
		t.setSecond(t.getSecond()+55);
		System.out.printf("변경후(범위밖)-> "+t);
		System.out.println("-> 범위를 벗어나 반환값이 없음. 기존값이 그대로 출력");
	}

}

class Time{
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			return;	
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			return;
		}
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			return;
		}
		this.second = second;
	}
	
	public String toString(){
		return hour + ":" + minute + ":" + second;
	}

	
}
