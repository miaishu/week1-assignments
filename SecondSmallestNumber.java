package week1.assignments;

import java.util.Arrays;

public class SecondSmallestNumber {
	
public static void main(String[] args) {
	
	int[] a={23,45,67,32,89,22 };
	
	Arrays.sort(a);
	
	//To print all the data
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");

	}
	
	System.out.println("The second smallest number is "+ a[1]);
	
}
	
}
