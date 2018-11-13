package com.andy;

public class GetRnd {

	public static void main(String[] args) {
		int []lot=new int [5];		//結果要5個數
		int min=5,max=20,num=5;		//5~20之間的亂數5個
		int max_dim=max-min+1;		
		int []t=new int[max_dim];
		for(int i=0;i<=max_dim-1;i++){	//5~20之間的所有整數
			t[i]=min+i;
		}
		int rem_num=max_dim;
		int choice;
		for(int i=0;i<=num-1;i++){
			choice=(int)(Math.random()*rem_num);	//從陣列t中選出亂數
			lot[i]=t[choice];						//放到陣列lot
			for(int j=choice;j<rem_num-1;j++){		//從被選出的數的位置開始
				t[j]=t[j+1];						//後面陣列的元素向前移一個位置
			}
			rem_num--;								
		}
		for(int i=0;i<5;i++)
			System.out.println(lot[i]);
	}

}
