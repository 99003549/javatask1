package com.ltts;

import java.util.Scanner;

public class InningsMain {
	public static void main(String[] args) {
		Innings i=new Innings();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the teamname:");
		String name=s.next();
		System.out.println("Enter session:");
		String session=s.next();
		System.out.println("Enter runs:");
		int runs=s.nextInt();
		
		i.setTeamname(name);
	    i.setInningsname(session);
		i.setRuns(runs);
		System.out.println("Enter the Team Name: "+i.getTeamname()+"\nEnter Address: "+i.getInningsname()+"\nEnter Mobile: "+i.getRuns());
	}
}

	


