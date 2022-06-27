package ch11;

import java.util.Properties;

public class Ch11_38 {

	public static void main(String[] args) {

		// Properties
		
		Properties sysProp = System.getProperties();
		System.out.println("java.version : " +
									sysProp.getProperty("java.version"));
		System.out.println("user.language : " +
									sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}

}
