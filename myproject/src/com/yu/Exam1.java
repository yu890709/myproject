package com.yu;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int oneWay=1000;
		int roundTrip=(int)(oneWay*2*0.9);
		Ticket ticket=new Ticket(oneWay, roundTrip);
		ticket.inputAndLoop();
	}

}
