import java.util.Scanner;

public class DemoElseIf {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int Number=sc.nextInt();
	if(Number<50)
	{
		System.out.println("The Number is Less than 50");
	}
	else if(Number < 30)
	{
		System.out.println("The Number is Less than 30");
	}
	else
	{
		System.out.println("The Number is 50");
	}
}

}
