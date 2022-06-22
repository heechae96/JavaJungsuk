package ch11;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ch11_12 {

	public static void main(String[] args) {

		// PriorityQueue
		
		Queue pq = new PriorityQueue();
		pq.offer(3);	// pq.offer(new Integer(3));	오토박싱
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq);
		
		Object obj = null;
		
		// PriorityQueue에 저장된 요소를 하나씩 꺼냄
		while((obj = pq.poll())!=null) {
			System.out.println(obj);
		}
	}

}
