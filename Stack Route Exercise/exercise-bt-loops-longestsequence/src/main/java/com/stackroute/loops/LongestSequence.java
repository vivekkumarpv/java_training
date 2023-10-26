package com.stackroute.loops;

import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) {
        new LongestSequence().inputAcceptor();
    }

    //write logic to get inputs from user and send inputs to inputValidator
    public void inputAcceptor() {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	inputValidator(num);
    }

    //write logic to get inputs from user and send inputs to findLongestSequence
    public void inputValidator(int number) {
    	if (number<0) {
    		System.out.println("Give proper input not negative number");
    	}else if(number==0) {
    		System.out.println("Give proper input not zero");
    	}else {
    		findLongestSequence(number);
    	}
    }

    //write logic to longest sequence of zeros in binary representation of given number , returns result
    public int findLongestSequence(int number) {
    	int maxNoZeros = -1;
        int count= 0;
       
        while (number != 0) {
            if ((number & 1) == 0 ) {
                count++;
                number >>= 1;
                maxNoZeros= Math.max(maxNoZeros, count);
            }
            else {
       
                maxNoZeros = Math.max(maxNoZeros, count);
                count = 0;
                number >>= 1;
            }
        }   
        outputPrinter(maxNoZeros);
        return maxNoZeros ;
    }

    //write logic to print the given printStatement
    public void outputPrinter(Object printStatement) {
    	System.out.println(printStatement);
    }
}
