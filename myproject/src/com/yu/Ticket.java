package com.yu;

import java.util.Scanner;

public class Ticket {
	int onePrice;
	int roundPrice;
	public Ticket(int onePrice,int roundPrice){
		this.onePrice=onePrice;
		this.roundPrice=roundPrice;
	}
	public void inputAndLoop(){
		Scanner in=new Scanner(System.in);
		int n=0;
		int r=0;
		int total=0;
		while(n!=-1||r!=-1){
			System.out.print("Please enter number of tickets: ");
			n=in.nextInt();
			if(n==-1)
				break;
			System.out.print("How many round-trip tickets: ");
			r=in.nextInt();
			if(r==-1)
				break;
			total=onePrice*(n-r)+roundPrice*r;
			System.out.print("Total tickets: "+n+"\nRound-trip: "+r+"\nTotal: "+total+"\n");
		}
	}
	
}
