package inheritanceactivities;

import java.util.Scanner;

public class ArrayIndexOutOfBounds_NegativeArraySize {
	public static void main(String[] args) {
		int arraysize,runs;
		Scanner sc=new Scanner(System.in);
		try
		{
		    System.out.println("Enter the number of overs:");
		    arraysize=sc.nextInt();
		    int[] arr=new int[arraysize];
		    System.out.println("Enter the number of runs of each over:");
		    for(int i=0;i<arraysize;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    System.out.println("Enter the over number:");
		    runs=sc.nextInt();
		    System.out.println("Runs scored in this over:"+arr[runs-1]);
		}
		catch(Exception e)
		{
		    System.out.println(e.getClass());
		}
	}

}

