import java.util.Scanner;

public class DemoNestedIf {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number a:");
	System.out.println("Enter the value of b:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	if(a!=20)
	{
	if(b==30)
	{
		System.out.println("True");
	}
	}
}

}
