package com.ust.app;

/**
 * Hello world!
 *
 */
public class LongestSubarray
{
    public SubarrayResult findLongestSubarray(int[] array) {
    	int sum=0;
    	int largest=Integer.MIN_VALUE;
    	for(int i=0;i<array.length-1;i++) {
    		sum=0;
    		for(int j=i;j<array.length;j++) {
    			sum+=array[j];
    			if(sum>largest) {
    				largest=sum;
    			}
    			//System.out.println(sum);
    		}
    	}
    	System.out.println(largest);
    	SubarrayResult result=new SubarrayResult(array, sum, 0);
    	System.out.println(result.getStartIndex());
        return result ;
    }
    public static void main(String []args) {
    	int [] array={1, 2, 3, 4, 5};
    	LongestSubarray obj = new LongestSubarray();
    	obj.findLongestSubarray(array);
    }
}

class SubarrayResult {
    private int[] subarray;
    private int startIndex;
    private int endIndex;

    public SubarrayResult(int[] subarray, int startIndex, int endIndex) {
        this.subarray = subarray;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int[] getSubarray() {
        return subarray;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }
}

