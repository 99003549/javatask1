import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class employeesort implements Comparable<employeesort>{
	
		 int id;
		 String name;
		 int salary;
		 
	    public employeesort() {
	    }
	 
	    public employeesort( int i,String n, int s) {
	           name = n;
	           salary = s;
	           id = i;
	    }
	 
	    public String toString() {
	    	return "\n  id=" + id + ", name=" + name + ", salary=" + salary ;
	    }
	 
	    public int compareTo(employeesort e) {
	           return this.name.compareTo(e.name);
	    }

	 
	 
	    public static void main(String[] args) {
	 
	           employeesort emp1 = new employeesort(1,"robin", 2000);
	           employeesort emp2 = new employeesort(2,"wilson", 500);
	           employeesort emp3 = new employeesort(3,"satya", 1000);
	           employeesort emp4 = new employeesort(4,"sonu", 9000);
	           employeesort emp5 = new employeesort(5,"sanjana", 1000);
	 
	           List<employeesort> l = new ArrayList<employeesort>();
	           l.add(emp1);
	           l.add(emp2);
	           l.add(emp3);
	           l.add(emp4);
	           l.add(emp5);
	 
	           Collections.sort(l); // SORT
	 
	           System.out.println(l); // Display list
	 
	    }
	 
	}

