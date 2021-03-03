package com.ltts;

import java.util.Scanner;

public class greaterid {
	
	static int len, score, count=0, ind = 0;
	static int[] cricket = new int[10];
		
	void findCricketId(int ckt[], int sze, int score) {
		for(int i=1;i<sze;i=i+2) {
			if(ckt[i]>score) {
				cricketer[ind]=ckt[i-1];
				ind++;
			}
		}
	}
	
	public static void main(String[] args) {
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("length of the array: ");
		len = sc.nextInt();
		
		int ckt[] = new int[len];
		System.out.println("Enter the cricketer id and score: ");
		for(i =0; i < len; i++) {
			ckt[i] = sc.nextInt();
		}
		
		System.out.println("Enter the score: ");
		score = sc.nextInt();
		
		greaterid ob = new greaterid();
		ob.findCricketId(ckt, len, xscore);
		
		for(j=0; j<ind; j++) {
			System.out.println(cricket[j]);
		}

		
	}
}
