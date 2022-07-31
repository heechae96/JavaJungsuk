package ch16;

import java.net.*;

public class Ch16_3 {

	public static void main(String[] args) {

		// URLConnection
		
		URL url = null;
		String address = "http://www.codechobo.com/sample/hello.html";
		
		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			
			System.out.println("conn.toString(): " + conn);
			System.out.println("getAllowUserInteraction() : "
								+ conn.getAllowUserInteraction());
			System.out.println("getConnectionTimeout(): "
								+ conn.getConnectTimeout());
			System.out.println("getContent(): " + conn.getContent());
			System.out.println("getContentEncoding(): " 
								+ conn.getContentEncoding());
			System.out.println("getContentLength(): " 
								+ conn.getContentLength());
			System.out.println("getContentType(): " 
								+ conn.getContentType());
			System.out.println("conn.getDate()" + conn.getDate());
			System.out.println("conn.getDefaultAllowUserInteraction()" 
								+ conn.getDefaultAllowUserInteraction());
			System.out.println("conn.getDefaultUseCaches()" 
											+ conn.getDefaultUseCaches());
			System.out.println("conn.getDoInput()" + conn.getDoInput());
			System.out.println("conn.getDoOutput()" + conn.getDoOutput());
			System.out.println("conn.getExpiration()" + conn.getExpiration());
			System.out.println("conn.getHeaderFields()" + conn.getHeaderFields());
			System.out.println("conn.getIfModifiedSince()" + conn.getIfModifiedSince());
			System.out.println("conn.getLastModified()" + conn.getLastModified());
			System.out.println("conn.getReadTimeout()" + conn.getReadTimeout());
			System.out.println("conn.getURL()" + conn.getURL());
			System.out.println("conn.getUseCaches()" + conn.getUseCaches());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
