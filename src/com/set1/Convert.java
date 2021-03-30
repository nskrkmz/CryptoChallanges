package com.set1;

import java.util.Scanner;

public class Convert {
	
	private char[] base64Index= new char[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9","+","/"};
	//default ctor.
	//if there is no data, data is received from the user(getUserData func.)
	public Convert() {
		getUserData();
	}
	
	public Convert (String _data) {
		hexToBase64(_data);
	}
	
	//return data from get User
	private String getUserData() {
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		return data;
	}
	
	protected static void hexToBase64(String data) {
		
	}
}

/*		Steps
 * Text to Base64 Encode
 * Hex Representation
 * Binary Representation
 * Grouped by 6-bits
 * Base64 Representation
 */
