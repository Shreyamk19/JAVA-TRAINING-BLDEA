package Trainingcodes;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		if (age<18)
		{
			System.out.println("U r a minor");
		}
		else if(age>85) {
			System.out.println("u r senior");
		}
		else {
			
		
			System.out.println("u r eligible");
		}
		
	}

}
