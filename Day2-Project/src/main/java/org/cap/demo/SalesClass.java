package org.cap.demo;

public class SalesClass {
	
	public void show(){
		int[] arg={12,45,67,90};
		int sum=0;
		for(int num:arg){
			sum+=num;
		}
		
		System.out.println("Summation: " + sum);
		
		for(int i=0;i<arg.length;i++)
			System.out.println(arg[i]);
		
		System.out.println("Show Method");
		System.out.println("Show Method for SalesClss");
	}

}
