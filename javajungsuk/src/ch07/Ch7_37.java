package ch07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occeurred!!!");
	}
}

public class Ch7_37 {

	public static void main(String[] args) {

		// 익명클래스
		// Ch7_38에서 변환
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}

}
