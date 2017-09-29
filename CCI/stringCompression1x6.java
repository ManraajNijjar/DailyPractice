package CCI;

import java.util.ArrayList;

public class stringCompression1x6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringCompression("aaaaaaa"));
		System.out.println(stringCompression("hello"));
		System.out.println(stringCompression("aabbccddddeefsap"));
		System.out.println(stringCompression("aAaAaAa"));
	}
	
	public static String stringCompression(String stringForCompression) {
		int charIterator = 0;
		ArrayList<String> compressedArrayList = new ArrayList<String>(0);
		char[] charFromCompString = stringForCompression.toCharArray();
		while(charIterator < stringForCompression.length()-1) {
			int charsInARow = 1;
			
			while(charFromCompString[charIterator] == charFromCompString[charIterator+1]) {
				charsInARow++;
				charIterator++;
				if(charIterator == charFromCompString.length-1) {
					break;
				}
			}
			
			compressedArrayList.add(Character.toString(charFromCompString[charIterator]));
			
			if (charsInARow > 1) {
				compressedArrayList.add(Integer.toString(charsInARow));
			}
			
			charIterator++;
		}
		//Cleans up the last character if needed for example hello or 
		if(charIterator == stringForCompression.length()-1) {
			compressedArrayList.add(Character.toString(charFromCompString[charIterator]));
		}
		
		String compressedString = compressedArrayList.toString();
		if (compressedString.length() == stringForCompression.length()) {
			return stringForCompression;
		}
		return compressedString;
	}
}
