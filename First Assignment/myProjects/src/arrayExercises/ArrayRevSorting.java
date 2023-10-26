package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRevSorting {
	public int reverse(int num){
		int temp=0;
		while(num>0){
			int rem=num%10;
			temp=(temp*10)+rem;
			num/=10;
		}
		return temp;
	}
	public int[] reverseArray(int[] arr){
	 	int []output = new int[arr.length];
	 	for (int i=0;i<arr.length;i++) {
	 		output[i]=reverse(arr[i]);
	 	}
		return output;
	}
	public int[] sort(int[] arr){
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[]args) {
		ArrayRevSorting obj=new ArrayRevSorting();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter "+size+ " elements: ");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int []result=new int[size];
		result=obj.reverseArray(arr);
		result=obj.sort(result);
		System.out.println("Sorted array after reversing the elements ");
		for(int num:result) {
			System.out.print(num+" ");
		}
	}

}
