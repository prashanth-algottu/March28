package Day7;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class EncodingAndDecoding {

	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		
		// Simple Encoder
		System.out.println("simple Encoding");
		String name="prahath is a good boy";
		
		String en = Base64.getEncoder().encodeToString(name.getBytes());
		System.out.println(en);
		System.out.println();
		
		// Decoding
		System.out.println("simple decoding");
		byte[] dearray = Base64.getDecoder().decode(en);
		String detext = new String(dearray, "UTF-8");
		System.out.println(detext);
		System.out.println();
		
		//URL Encoding
		System.out.println("URL Encoding");
		String url="https://www.youtube.com/watch?v=ZhMOINkAKqU";
		String urlencode = Base64.getUrlEncoder().encodeToString(url.getBytes());
		System.out.println(urlencode);
		System.out.println();
		
		//URL Decode
		byte[] urldecode = Base64.getUrlDecoder().decode(urlencode);
		String urlString = new String(urldecode);
		System.out.println(urlString);
		
		

	}

}
