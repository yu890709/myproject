package com.andy;

import java.util.Arrays;
import java.util.Scanner;

public class SortOneToTen {

	public static void main(String[] args) {
		int[] array=new int[10];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			array[i]=in.nextInt();
		}
		for(int i:array){
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(array);
		for(int i:array){
			System.out.print(i+" ");
		}
	}

}
