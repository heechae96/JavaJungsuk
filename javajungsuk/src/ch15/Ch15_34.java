package ch15;

import java.io.File;
import java.io.FilenameFilter;

public class Ch15_34 {

	public static void main(String[] args) throws Exception{

		// File
		
		if(args.length != 1) {
			System.out.println("USAGE: java Ch15_34 pattern");
			System.exit(0);
		}
		
		String currDir = System.getProperty("user.dir");
		
		File dir = new File(currDir);
		final String pattern = args[0];
		
		// String[] list (FileNameFilter filter)
		String[] files = dir.list(new FilenameFilter() {
			
			public boolean accept(File dir, String name) {
				return name.indexOf(pattern) != -1;
			}
		});
		
		for(int i=0; i<files.length; i++) {
			System.out.println(files[i]);
		}
	}

}
