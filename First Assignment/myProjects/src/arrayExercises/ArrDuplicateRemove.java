package arrayExercises;

import java.util.*;

public class ArrDuplicateRemove {
	public int[] removeArrDuplicates(int [] arr){
		
		Set<Integer> set=new HashSet<Integer>();
		for (int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int []result=new int[set.size()];
		int j = 0;
        for (int x : set) {
            result[j++] = x;
        }
        Arrays.sort(result);
        int k=result.length;
        int[] out=new int[k];
        for(int num:result) {
        	out[k-1]=num;
        	k--;
        }
		return out;
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter "+size+ " elements: ");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		ArrDuplicateRemove obj=new ArrDuplicateRemove();
		int []result=new int[size];
		result=obj.removeArrDuplicates(arr);
		System.out.println("Array after removing duplicate items and sorted in descending order");
		for(int num :result) {
			System.out.print(num+" ");
		}
	}
}

