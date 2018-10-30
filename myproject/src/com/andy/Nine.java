package com.andy;

public class Nine {

	public static void main(String[] args) {
		int[][] nine=new int[][]{{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};	
		for(int j=0;j<nine[0].length;j++){
			for(int k=0;k<nine[1].length;k++){
				System.out.print(nine[0][j]+"*"+nine[1][k]+"="+(nine[0][j]*nine[1][k])+"\t");
			}
			System.out.println();
		}
		
		/*System.out.print(nine[0].length+" "+nine[1].length+" "+nine.length);		9 9 2	*/
	}

}
