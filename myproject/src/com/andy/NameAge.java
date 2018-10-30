package com.andy;

import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		String[] name=new String[]{"陳一","林二","張三","李四","王五"};
		int[] age=new int[]{56,45,51,48,35};
		System.out.print("選擇按年齡排序方法，請輸入1或2(1.遞增 2.遞減):"); 
		Scanner in=new Scanner(System.in);
		int c,t=0;
		do{
			c=in.nextInt();
			if(c==1||c==0){
				if(c==1){
					for(int i=0;i<age.length-1;i++){
						
					}
				}
				else{
					
				}
			}
			else{
				System.out.print("輸入錯誤，請重新輸入1或2(1.遞增 2.遞減):");
			}
		}while(c!=1||c!=0);
	}

}
