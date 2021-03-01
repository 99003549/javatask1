import java.util.Scanner;

public class DemoIf {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age of candidate");
	int age=sc.nextInt();
		if(age >= 18)
		{
			System.out.println("Eligible for vote");
		}
	}

}
