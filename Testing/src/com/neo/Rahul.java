package com.neo;

import java.util.Arrays;

public class Rahul {

	public static void main(String[] args) {
		int [] arr={3,2,5,1,6,8,0};
		int temp;
		for(int i=0;i<arr.length;i++){
			if(i+1>arr.length){
				break;
			}
			
			if(i==0){
				if(arr[i+1]<=arr[i+2]){
					System.out.println(Arrays.toString(arr));
				}else{
					temp=arr[i+1];
					arr[i+1]=arr[i+2];
					arr[i+2]=temp;
					System.out.println(Arrays.toString(arr));
				}
			}else{
			if(arr[i]<=arr[i+1]){
				System.out.println(Arrays.toString(arr));
			}else{
				temp=arr[0];
				arr[0]=arr[i+1];
				arr[i+1]=temp;
				System.out.println(Arrays.toString(arr));
			}
			}
		}
		System.out.println(Arrays.toString(arr));
		String s="";
		int [] a={5,2,6,3,8,9,1};
		
	}

		
		
		/*for(int k=0;k<3;k++){
		for(int i=0;i<=arr.length-2;i++){
			if(i==0){
				first=arr[i];
			    arr[i]=arr[i+1];
			}else{
				arr[i]=arr[i+1];
				if(i==arr.length-2){
					arr[arr.length-1]=first;
				}
			}
		}
		
		}System.out.println(Arrays.toString(arr));*/
		//other();
		//System.out.println(Arrays.toString(other(arr,d)));
	
	
	public static int[] other(int [] a){
		int n=a.length;
		n %= a.length;
		int[] ret = new int[a.length];
		    for(int i = 0; i < a.length; ++i) {
		        ret[i] = a[(i + n) % a.length];
		    }
		    return ret;
	}
	
	
	


}
