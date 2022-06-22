package ch11;

import java.util.Iterator;

// Ch11_4
// Array클래스 내부(Vector클래스의 실제코드를 바탕으로 재구성)
public class Ch11_16 extends Ch11_4 implements Iterator{
// public class MyVector2 extends MyVector implements Iterator{	
	// Iterator
	
	int cursor = 0;
	int lastRet = -1;
	
	public Ch11_16(int capacity) {
		super(capacity);
	}
	
	public Ch11_16() {
		this(10);
	}
	
	public String toString() {
		String tmp = "";
		Iterator it = iterator();
		
		for(int i=0; it.hasNext(); i++) {
			if(i!=0) {
				tmp += ", ";
			}
			
			tmp += it.next();
		}
		
		return "[" + tmp + "]";
	}
	
	public Iterator iterator() {
		cursor = 0;
		lastRet = -1;
		return this;
	}
	
	public boolean hasNext() {
		return cursor != size();
	}
	
	public Object next() {
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
	}
	
	public void remove() {
		// 더이상 삭제할 것이 없으면 IllegalStateException를 발생
		if(lastRet == -1) {
			throw new IllegalStateException();
		}else {
			remove(lastRet);
			cursor--;		// 삭제 후에 cursor의 위치를 감소
			lastRet = -1;	// lastRet의 값을 초기화
		}
	}
}
