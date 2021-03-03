package com.ltts;

import java.util.Scanner;

public class InningsMain {
	public static void main(String[] args) {
		String name;
		String session;
		int runs;
		Innings i=new Innings();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the teamname:");
		name=s.next();
		System.out.println("Enter session:");
		session=s.next();
		System.out.println("Enter runs:");
		runs=s.nextInt();
		
		i.setInningsname(session);
	    i.setTeamname(name);
		i.setRuns(runs);
	    Innings.displayInningsDetails();
	}
}

	


