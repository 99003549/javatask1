package com.ltts;

public class Innings {
	private static String teamname;
	private static String inningsname;
	private static int runs;
	public static String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		Innings.teamname = teamname;
	}
	public static String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		Innings.inningsname = inningsname;
	}
	public static int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		Innings.runs = runs;
	}
public static void displayInningsDetails() {
	System.out.println("Name:"+Innings.getInningsname());
	System.out.println("scored:"+Innings.getRuns());
	String t=(Innings.getInningsname());
	if(t=="First" || t=="first")
	{
		System.out.println("Need "+(Innings.getRuns()+1)+ " to win");
	}
	else
	{
		System.out.println("Match Ended");
	}
	
	
}


	
}



