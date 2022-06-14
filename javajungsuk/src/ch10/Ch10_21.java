package ch10;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class Ch10_21 {

	public static void main(String[] args) throws Exception {

		// MessageFormat
		
		String tableName = "CUST_INFO";
		String fileName = "data4.txt";
		String msg = "INSERT INTO " + tableName + " VALUES ({0}, {1}, {2}, {3});";
		
		Scanner scan = new Scanner(new File(fileName));
		
		String pattern = "{0}, {1}, {2}, {3}";
		MessageFormat mf = new MessageFormat(pattern);
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(MessageFormat.format(msg, objs));
		}
		
		scan.close();	// 작업이 끝났으니 Scanner에서 사용한 파일을 닫아 준다
	}

}
