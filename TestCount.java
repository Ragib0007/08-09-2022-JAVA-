package com.Test.pll;
import java.util.*;
import com.ds.*;

public class TestCount {
public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			CountAnother count=new CountAnother();
			System.out.println("Total Number of Digits:"+count.countDigits(n));
			sc.close();
			}
		else {
			System.out.println("Enter the valid number");
		}
		if(n<0) {
			System.out.println("Please Enter  Number Greater Than ZEro" );
		}
		
	}

}
