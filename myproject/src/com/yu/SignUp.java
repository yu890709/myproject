package com.yu;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("是否成年(y/N)");
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();
		boolean adutl=line.equalsIgnoreCase("y");
		if(adutl){
			System.out.print("輸入年齡:");
			int age=in.nextInt();
			in.nextLine();
			System.out.print("輸入性名:");
			String name=in.nextLine();
			System.out.print("輸入暱稱:");
			String nickName=in.nextLine();
			System.out.println("您的資料如下:\n年齡:"+age+"\n姓名:"+name+"\n暱稱:"+nickName);
		}
		else{
			System.out.println("無法註冊");
		}

	}

}
