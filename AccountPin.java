package com.pin.sll;
import java.util.*;

public class AccountPin {
	public static void main (String [] args)
	{
		final String PASS="1234"; int count=0;
		Scanner sc=new Scanner(System.in);
		while(count<3)
		{
		 count++;
		 System.out.println("Enter the Password");
		 String inputPassword=sc.next();
		 if(inputPassword==PASS) {
			System.out.println("WElcome");
			break;
		 }
		 else {
			 System.out.println("Wrong Password");
		 }
		}
		if (count==3) { 
			System.out.println("Your Account has been locked");
		}
				
		
		}
  }
