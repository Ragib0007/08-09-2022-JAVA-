package com.whi.ssl;
import java.util.*;

public class WhileLoop {
	 
		public static void main (String[] args) {
			int sumEven=0;
			int sumOdd=0;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter First Number :");//First number
			int firstNum= sc.nextInt();
			System.out.println("Enter Second Number :");//Second number
			int secondNum= sc.nextInt();
			
			if(firstNum<secondNum) { 
				System.out.println("Your  first number is smaller than second number. ");
				for(int i=firstNum;i<=secondNum;i++){
					if(i%2==0)  
				// print the even no.  between the 1st no. and 2nd no.
				{
					System.out.println("Even Number are "+i);
					sumEven+=i;
				}
			}
			{//print the sum of all even no. between  1st no. and 2nd no .
				System.out.println("Sum of Even Numbers are :"+sumEven);
				
				for(int i=firstNum;i<=secondNum;i++){
					if(i%2==1)
				// print the odd no. between the 1st no. and 2nd no.
						{ 
						System.out.println("Odd Number are "+i);
						sumOdd+=i;
					}
			}//print the sum of all odd no. between  1st no. and 2nd no.
				System.out.println("Sum of Odd Numbers are :"+sumOdd);
			}
			}
			sc.close();
		}
	}


