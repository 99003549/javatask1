package strings;

import java.util.Arrays;

public class stringactivities {
	
	public static void main(String[] args) {
		

		//length
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		//charAt
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);
		
		//equal
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		String myStr3 = "Another String";
		System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
		System.out.println(myStr1.equals(myStr3)); // false
		
		//compareTo
		String myStr4 = "Hello";
		String myStr5 = "Hello";
		System.out.println(myStr4.compareTo(myStr5)); // Returns 0 because they are equal
		
		//concat
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		
		//getBytes
		String str = "Java";
	    byte[] byteArray;

	    // convert the string to a byte array
	    // using platform's default charset
	    byteArray = str.getBytes();
	    System.out.println(Arrays.toString(byteArray));
	    
	    
	    //indexOf
	    String myStr6 = "Hello planet earth, you are a great planet.";
	    System.out.println(myStr6.indexOf("p",10));//index of p from 10th elemenet
	    
	    //replace
	    String myStr7 = "Hello";
	    System.out.println(myStr7.replace('l', 'p'));
	    
	    //trim
	    String myStr8 = "       Hello World!       ";
	    System.out.println(myStr8);
	    System.out.println(myStr8.trim());
	    


	    
	  }

		
	}



