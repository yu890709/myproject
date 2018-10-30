package com.yu;

public class Test {

	public static void main(String[] args) {
		double n=(double)3/5;			//0.6
		double m=(double)(3/5.0);		//0.6
		double l=(double)(3/5);			//0.0
		double x=(double)3/5.0;			//0.6
		double y=3/5;					//0.0
		
		int a=3/5;
		int b=(int)(3.0/5);
		/*int c=(int)3/5.0);			½sÄ¶¿ù»~*/				
		
		System.out.printf("%f %f %f",n,l,x);
	}

}
