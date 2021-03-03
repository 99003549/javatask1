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

}

	


