package inheritanceactivities;

import java.util.Scanner;

public class Arithmetic_Number_Format {
	public static void main(String[] args) {
		float totalruns,totalovers;
		String str,sto;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the total runs scored:");
			str=sc.next();
			 totalruns = Integer.parseInt(str);  
			System.out.println("Enter the total overs faced:");
			sto=sc.next();
			totalovers = Integer.parseInt(sto);  
			float rr=totalruns/totalovers;
			System.out.printf("Current Run Rate:%.2f",rr);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
	}

}

