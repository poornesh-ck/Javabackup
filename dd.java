package edu;
import java.util.Scanner;

class dd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n[]=new int[5];
		for(int i=0;i<5;i++){
			n[i]=sc.nextInt();
			
		}
		int max=n[0];
		for(int i=0;i<5;i++){
			if(n[i]>max){
				max=n[i];
        		}
		}
		System.out.println("the greatest number is : "+max);
		
		
	}	

}