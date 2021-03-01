import java.util.Scanner;

public class DemoFor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Value of x:");
	//int x=sc.next();
	for(int x=sc.nextInt();x<=20;x++) {
		System.out.println("The value of x is:" +x);
		System.out.println("\n");
	}
		
}

}
