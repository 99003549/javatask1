package inheritanceactivities;

import java.util.Scanner;
public class inheritance1 {
class Vehicle{
	protected String Make;
	protected String vehicleNo;
	protected String fuelT;
	protected int fuelC;
	protected int c;
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getFuelT() {
		return fuelT;
	}
	public void setFuelT(String fuelT) {
		this.fuelT = fuelT;
	}
	public int getFuelC() {
		return fuelC;
	}
	public void setFuelC(int fuelC) {
		this.fuelC = fuelC;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
    {
    	this.Make=make;
    	this.vehicleNo=vehicleNumber;
    	this.fuelT=fuelType;
    	this.fuelC=fuelCapacity;
    	this.c=cc;
    }
    void displayMake()
    {
		
    	System.out.println("****"+(this.getMake())+"****");
    	System.out.println("---Basic Information--");
    	System.out.println("Vehicle Number:"+(this.getVehicleNo()));
    	System.out.println("Fuel Capacity:"+(this.getFuelC()));
    	System.out.println("Fuel Type:"+(this.getFuelT()));
    	System.out.println("CC:"+this.getC());
    }
    	

    void displayBasicInfo()
    {
    	
    }
    void displayDetailInfo()
    {
    	System.out.println("An empty method");
    }
}

class TwoWheeler extends Vehicle{

	private boolean kickStartAvailable;
	//get set
	public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc,boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable=kickStartAvailable;
		// TODO Auto-generated constructor stub
	}
    void displayDetailInfo()
    {
    	System.out.println("---Detail Information---");
	string a;
	if(this.kickStartAvailable)
	{
		a="yes";
	}
	else
	{
		a="no";
	}
	system.out.println("kick start Available:"+a.toUpperCase());
    }
}

class FourWheeler extends Vehicle{

	private String audioSystem;
	private int numberOfDoors;
	//get set
	public FourWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc,
			 String audioSystem, int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem=audioSystem;
		this.numberOfDoors=numberOfDoors;
		// TODO Auto-generated constructor stub
	}
	void displayDetailInfo()
	{
		System.out.println("---Detail Information--");
		System.out.println("Audio System:"+(this.audioSystem));
		System.out.println("Number of Doors:"+(this.numberOfDoors));
		
		
	}

}
public class inheritance1 {
public static void main(String[] args)
{
	String make = null;
	String vehiclenumber = null;
	String fuletype = null;
	String fuelcapacity = null;
	String cc = null;
	boolean kick=false;
	String kicksstart;
	String audio=null;
	int numofdoors=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("1. Four Wheeler\n2. Two Wheeler");
	System.out.println("Enter Vehicle Type:");
	int num=sc.nextInt();
	switch(num)
	{
		case 1:
			FourWheeler fv=new FourWheeler(make, vehiclenumber, fueltype, fuelcapacity, cc, audio, numofdoors);
			System.out.println("Vehicle Make:");
			make=sc.next();
			fv.setMake(make);
			System.out.println("Vehicle Number:");
			vehiclenumber=sc.next();
			fv.setVehicleNumber(vehiclenumber);
			System.out.peintln("Fuel Tyoe:\n1.Petrol \n2.Deisel");
			num=sc.nextInt();
			if(num==1)
			{
				fv.setFuelType("Petrol");
			}
			else
			{
				fv.setFuelType("Diesel");
			}
			System.out.println("Fuel Capacity:");
			fuelcapacity=sc.nextInt();
			fv.setFuelCapacity(fuelcapacity);
			System.out.println("Engine CC:");
			fcc=sc.nextInt();
			fv.setCC(cc);
			System.out.println("Audio System:");
			audio=sc.nextInt();
			fv.setaudio(audio);
			System.out.println("Number of doors:");
			Numofdoors=sc.nextInt();
			fv.set.Numofdoors(Numofdoors);
			
			fv.displayBasicInfo();
			fv.displayDetailInfo();
		case 2:
			TwoWheeler tv=new TwoWheeler(make, vehiclenumber, fueltype, fuelcapacity, cc, kick);
			System.out.println("Vehicle Make:");
			make=sc.next();
			tv.setMake(make);
			System.out.println("Vehicle Number:");
			vehiclenumber=sc.next();
			tv.setVehicleNumber(vehiclenumber);
			System.out.peintln("Fuel Tyoe:\n1.Petrol \n2.Deisel");
			num=sc.nextInt();
			if(num==1)
			{
				tv.setFuelType("Petrol");
			}
			else
			{
				tv.setFuelType("Diesel");
			}
			System.out.println("Fuel Capacity:");
			fuelcapacity=sc.nextInt();
			tv.setFuelCapacity(fuelcapacity);
			System.out.println("Engine CC:");
			fcc=sc.nextInt();
			tv.setCC(cc);
			System.out.println("kick start available(yes/no):");
			kickstart=sc.next();
			if(kickstart.equals("yes"))
			{
				tv.setkickstartavailable(true);
			}
			else
			{
				tv.setkickstartavailable(false);
			}
			
			tv.displayBasicInfo();
			tv.displayDetailInfo();
		
	}
}
}

	


