package ch13;

import java.util.ArrayList;

public class Ch13_24 {

	public static void main(String[] args) throws Exception {

		// wait(), notify()

		Table2 table = new Table2();	// 여러 쓰레드가 공유하는 객체
		
		new Thread(new Cook2(table), "COOK1").start();
		new Thread(new Customer2(table, "donut"), "CUST1").start();
		new Thread(new Customer2(table, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);		// 프로그램 전체를 종료.(모든 쓰레드가 종료됨)
	}

}

class Customer2 implements Runnable{
	private Table2 table;
	private String food;
	
	Customer2(Table2 table, String food){
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {}
			
			String name = Thread.currentThread().getName();
			
			if(eatFood())
				System.out.println(name + " ate a " + food);
			else
				System.out.println(name + " failed to eat : (");
		}
	}
	
	boolean eatFood() {
		return table.remove(food);
	}
	
}

class Cook2 implements Runnable{
	private Table2 table;
	
	Cook2(Table2 table){
		this.table = table;
	}
	
	public void run() {
		while(true) {
			// 임의의 요리를 하나 선택해서 table에 추가
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
		}
	}
}

class Table2{
	// 일부러 도넛이 자주 나오도록
	String[] dishNames = {"donut", "donut", "burger"};
	// 테이블에 놓을 수 있는 최대 음식의 개수
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	// 동기화
	// synchronized를 추가
	public synchronized void add(String dish) {
		// 테이블에 음식이 가득 찼으면, 테이블에 음식을 추가하지 않는다
		if(dishes.size() >= MAX_FOOD) {
			return;
		}
		
		dishes.add(dish);
		System.out.println("Dishes: " + dishes.toString());
	}
	
	// 동기화
	// synchronized를 추가
	public boolean remove(String dishName) {
		synchronized (this) {
			while(dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting");
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {}
			}
		}
		// 지정된 요리와 일치하는 요리를 테이블에서 제거
		for(int i=0; i<dishes.size(); i++)
			if(dishName.equals(dishes.get(i))){
				dishes.remove(i);
				return true;
			}
		return false;
	}
	
	public int dishNum() {
		return dishNames.length;
	}
}

