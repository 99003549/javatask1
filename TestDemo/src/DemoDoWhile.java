import java.util.Scanner;

public class DemoDoWhile {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x:");
	int x=sc.nextInt();
	do
	{
	System.out.println("the value of x is:" +x);
	x++;
	System.out.println("\n");
	}while(x<=20);
}

}
