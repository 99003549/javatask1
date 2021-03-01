import java.util.Scanner;

public class DemoIfElse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int number=sc.nextInt();
	if(number>5)
	{
		System.out.println("Number is greater than 5");
	}
	else
	{
		System.out.println("Number is less than 5");
	}
}

}
