import java.util.LinkedList;
import java.util.Scanner;

class CRUD1 {
	static int noOfContacts=0;
	String EmployeefirstName;
	String EmployeelastName;
	String EmployeephoneNumber;
	String EmployeeId;
	//constructor
	public CRUD1(String EmployeefirstName, String EmployeelastName, String EmployeephoneNumber, String EmployeeId) {
		this.EmployeefirstName = EmployeefirstName;
		this.EmployeelastName = EmployeelastName;
		this.EmployeephoneNumber = EmployeephoneNumber;
		this.EmployeeId = EmployeeId;
	
}
	public String getEmployeefirstName() {
		return EmployeefirstName;
	}
	public void setEmployeefirstName(String employeefirstName) {
		EmployeefirstName = employeefirstName;
	}
	public String getEmployeelastName() {
		return EmployeelastName;
	}
	public void setEmployeelastName(String employeelastName) {
		EmployeelastName = employeelastName;
	}
	public String getEmployeephoneNumber() {
		return EmployeephoneNumber;
	}
	public void setEmployeephoneNumber(String employeephoneNumber) {
		EmployeephoneNumber = employeephoneNumber;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	int createContact()
	{
		return(1);
	}
	int readContact()
	{
		return(1);
	}
	int updateContact()
	{
		return(1);
	}
	int deleteContact()
	{
		return(1);
	}
}

public class CRUD {
	static LinkedList<CRUD1> l=new LinkedList<CRUD1>();
	static CRUD1 c1=new CRUD1(null,null,null,null);
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----Welcome to the CRUD apllication----");
		do
		{
			System.out.println("1.Create \n2.Read \n3.Update \n4.Delete \n5.exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("----Create----");
						//firstname
						System.out.println("Enter first name:");
						c1.setEmployeefirstName(sc.next());
						//lastname
						System.out.println("Enter last name:");
						c1.setEmployeelastName(sc.next());
						//mobilenumber
						System.out.println("Enter phone number:");
						c1.setEmployeephoneNumber(sc.next());
						//emailid
						System.out.println("Enter Employee Id");
						c1.setEmployeeId(sc.next());
						l.add(c1);
			 			break;
				case 2: System.out.println("----Read----");
						
			 			break;
				case 3: System.out.println("----Update----");
			 			break;
				case 4: System.out.println("----Delete----");
			 			break;
				case 5: System.out.println("----Exiting----");
						break;
				default: System.out.println("Invalid choice!!!");
					
		    }
		}while(ch!=5);
		
		
	}

}
