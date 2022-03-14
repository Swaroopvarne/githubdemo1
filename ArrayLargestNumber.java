package com.te.javabasics.Test;

public class ArrayLargestNumber {
	public static void main(String[] args) {
		 int [] arr = new int [] {2000, 11, 7, 77,1666};  
	        //Initialize max with first element of array.  
	        int max = arr[0];  
	        //Loop through the array  
	        for (int i = 0; i < arr.length; i++) {  
	            //Compare elements of array with max  
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);  
	    }  
	}


