package com.andy;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Player p;
		CDPlayer cdp = new CDPlayer();
		DVDPlayer dvdp=new DVDPlayer();
		Scanner in=new Scanner(System.in);
		System.out.print("¿é¤JCD©ÎDVD");
		String c=in.nextLine();
		if(c.equalsIgnoreCase("CD")){
			p=cdp;
			p.show();
		}
		if(c.equalsIgnoreCase("DVD")){
			p=dvdp;
			p.show();
		}
	}

}
