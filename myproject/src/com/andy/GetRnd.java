package com.andy;

public class GetRnd {

	public static void main(String[] args) {
		int []lot=new int [5];		//���G�n5�Ӽ�
		int min=5,max=20,num=5;		//5~20�������ü�5��
		int max_dim=max-min+1;		
		int []t=new int[max_dim];
		for(int i=0;i<=max_dim-1;i++){	//5~20�������Ҧ����
			t[i]=min+i;
		}
		int rem_num=max_dim;
		int choice;
		for(int i=0;i<=num-1;i++){
			choice=(int)(Math.random()*rem_num);	//�q�}�Ct����X�ü�
			lot[i]=t[choice];						//���}�Clot
			for(int j=choice;j<rem_num-1;j++){		//�q�Q��X���ƪ���m�}�l
				t[j]=t[j+1];						//�᭱�}�C�������V�e���@�Ӧ�m
			}
			rem_num--;								
		}
		for(int i=0;i<5;i++)
			System.out.println(lot[i]);
	}

}
