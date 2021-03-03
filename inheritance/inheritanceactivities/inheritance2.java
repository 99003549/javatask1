package inheritanceactivities;

import java.util.Scanner;


class HotelRoom
{
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean isHasTV() {
		return hasTV;
	}
	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
	public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
	{
		this.hotelName=hotelName;
		this.numberOfSqFeet=numberOfSqFeet;
		this.hasTV=hasTV;
		this.hasWifi=hasWifi;
	}
	int calculateTariff(int costpersec)
	{
		return((this.numberOfSqFeet)* costpersec);
	}
	int getRatePerSqFeet()
	{
		return( 0);
	}
class DeluxeRoom extends HotelRoom
{
	int ratePerSqFeet;

	public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// DeluxeRoom construct
		this.ratePerSqFeet=10;
}
	public int getRatePerSqFeet()
	{
		if((this.hasWifi))
		{
			return(ratePerSqFeet+2);
		}
		else
		{
			return(ratePerSqFeet);
		}
	}
	
	
}
	
}
class DeluxeACRoom extends DeluxeRoom
{
	//constructor
	public DeluxeACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// DeluxeACRoom constructor
		this.ratePerSqFeet=12;
	}
}

class SuiteAcRoom extends HotelRoom
{
	private int ratePerSqFeet;
	//constructor
	public SuiteAcRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// SuiteAcRoom constructor
		this.ratePerSqFeet=15;
	}
	//getRatePerSqFeet function
	public int getRatePerSqFeet()
	{
		if((this.hasWifi))
		{
			return(ratePerSqFeet+2);
		}
		else
		{
			return(ratePerSqFeet);
		}
	}
	
}
public class inheritance2 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num;
			String s;
			System.out.println("Hotel Tarrif Calculator\n1.Deluxe Room\n2.Deluxe AC Room\n3.Suite AC Room");
			System.out.println("Select Room Type:");
			num=sc.nextInt();
			if(num==1)
			{
				DeluxeRoom h1=new DeluxeRoom(null, 0, false, false);
				//name
				System.out.println("Hotel Name:");
				h1.setHotelName(sc.next());
				//Room Square Feet Area
				System.out.println("Room Square Feet Area:");
				h1.setNumberOfSqFeet(sc.nextInt());
				//TV
				System.out.println("Room has TV(yes/no):");
				s=sc.next();
				if(s.equals("yes"))
				{
					h1.setHasTV(true);
				}
				else
				{
					h1.setHasTV(false);
				}
				//Wifi
				System.out.println("Room has wifi(yes/no):");
				s=sc.next();
				if(s.equals("yes"))
				{
					h1.setHasWifi(true);
				}
				else
				{
					h1.setHasWifi(false);
				}
				
				//Room tariff
				System.out.println("Room Tariff per day is:"+h1.calculateTariff(h1.getRatePerSqFeet()));
			}
			else
			{
				if(num==2)
				{
					DeluxeACRoom h1=new DeluxeACRoom(null, 0, false, false);
					//name
					System.out.println("Hotel Name:");
					h1.setHotelName(sc.next());
					//Room Square Feet Area
					System.out.println("Room Square Feet Area:");
					h1.setNumberOfSqFeet(sc.nextInt());
					//TV
					System.out.println("Room has TV(yes/no):");
					s=sc.next();
					if(s.equals("yes"))
					{
						h1.setHasTV(true);
					}
					else
					{
						h1.setHasTV(false);
					}
					//Wifi
					System.out.println("Room has wifi(yes/no):");
					s=sc.next();
					if(s.equals("yes"))
					{
						h1.setHasWifi(true);
					}
					else
					{
						h1.setHasWifi(false);
					}
					
					//Room tariff
					System.out.println("Room Tariff per day is:"+h1.calculateTariff(h1.getRatePerSqFeet()));
				}
				else
				{
					if(num==3)
					{
						SuiteAcRoom h1=new SuiteAcRoom(null, 0, false, false);
						//name
						System.out.println("Hotel Name:");
						h1.setHotelName(sc.next());
						//Room Square Feet Area
						System.out.println("Room Square Feet Area:");
						h1.setNumberOfSqFeet(sc.nextInt());
						//TV
						System.out.println("Room has TV(yes/no):");
						s=sc.next();
						if(s.equals("yes"))
						{
							h1.setHasTV(true);
						}
						else
						{
							h1.setHasTV(false);
						}
						//Wifi
						System.out.println("Room has wifi(yes/no):");
						s=sc.next();
						if(s.equals("yes"))
						{
							h1.setHasWifi(true);
						}
						else
						{
							h1.setHasWifi(false);
						}
						
						//Room tariff
						System.out.println("Room Tariff per day is:"+h1.calculateTariff(h1.getRatePerSqFeet()));
					}
				}
			}
		}
	}

