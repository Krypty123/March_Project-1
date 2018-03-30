package org.cap.demo;

public class SalesClass {
	
	public void show(){
		int[] arg={12,45,67,90};
		int sum=0;
		for(int num:arg){
			sum+=num;
			sum-=10;
		}
		System.out.println("Sum: " + sum);
		
		System.out.println("Show Method");
		System.out.println("Show Method for SalesClss");
	}

}
