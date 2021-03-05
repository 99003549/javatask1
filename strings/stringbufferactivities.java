package strings;

public class stringbufferactivities {
	public static void main(String[] args) {
		
	
//......length in string buffer........
	 StringBuffer buff = new StringBuffer("Tutorials");
     
     // printing the length of string buffer
     System.out.println("length = " + buff.length());

     buff = new StringBuffer("");
     
     // printing the length of empty string buffer
     System.out.println("length = " + buff.length());
     
//............capacity in string buffer..............
     StringBuffer buff1 = new StringBuffer("TutorialsPoint");
     
     // returns the current capacity of the String buffer i.e. 16 + 14
     System.out.println("capacity = " + buff1.capacity());
     
 //...........append in string buffer.................
     
     StringBuffer sb = new StringBuffer("Test");
     sb.append(" String Buffer");
     System.out.println(sb); 
     
//..............insert in string buffer................
     
     StringBuffer sb1 = new StringBuffer("value1 is ");  
     System.out.println("string1: "+sb1);  
  // inserting boolean argument  
     sb1.insert(10,true);  
     // print the StringBuffer after inserting  
     System.out.println("after insert: " + sb1);  
     
//..............reverse in string buffer.................
     
     StringBuffer s = new StringBuffer("programming");  
     System.out.println("string: " + s);  
     // reversing of string buffer  
     System.out.println("reverse: " + s.reverse());  
     
     
}
}
