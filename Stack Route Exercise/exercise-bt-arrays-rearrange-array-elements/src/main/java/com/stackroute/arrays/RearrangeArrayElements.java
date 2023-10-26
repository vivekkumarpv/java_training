package com.stackroute.arrays;
import java.util.Scanner;

public class RearrangeArrayElements{
    public static void main(String[] args) {
       RearrangeArrayElements obj=new RearrangeArrayElements();
        obj.inputAcceptor();
    }

    //write logic to get inputs from user and send inputs for validation
    public void inputAcceptor() {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean validSize=inputArraySizeValidator(size);
        boolean validArr=inputArrayValidator(arr);
        int[]finaloutput=new int[size];
        if(validSize && validArr) {
        	finaloutput=computeRearrangedArray(arr);
            displayResult(finaloutput);
        }
        if(validSize==false){
            displayResult(finaloutput);
        }
        
    }

    //write logic to validate the given array size is valid or not
    public boolean inputArraySizeValidator(int size) {
        boolean result=false;
        if(size>0){
            result=true;
        }else{
            result=false;
        }
        return result;
    }

    //write logic to validate the given input array is sorted or not
    public boolean inputArrayValidator(int[] input){
        boolean output=false;
        for(int i=0;i<input.length-1;i++){
            if(input[i]>input[i+1]){
                output=false;
                break;

            }else{
                output=true;
            }
        }
        return output;
    }

    //write logic to rearrange elements of array and return the result array
    public int[] computeRearrangedArray(int[] inputArray) {
        int j=inputArray.length;
        int [] temp=new int[j];
        for(int i=0;i<inputArray.length;i++){
            temp[i]=inputArray[j-1];
            j--;
        }
        int newLength=inputArray.length/2;        
        int [] resultArr=new int[inputArray.length];
        for(int k=0;k<newLength;k++){
            resultArr[k*2]=temp[k];
            resultArr[k*2+1]=inputArray[k];
        }if(inputArray.length%2!=0){
            resultArr[inputArray.length-1]=temp[newLength];
        }
        if(inputArray.length==1) {
        	System.out.println("h");
        	return inputArray;
        	
        }
        return resultArr;
    }

    //write logic to print the result
    public void displayResult(int[] outputArray) {
        if(outputArray.length==0){
            System.out.println("Give proper input");
        } 
        else{
            for(int num:outputArray){
                System.out.print(num+" ");
            }
        }  
    }
    
}
