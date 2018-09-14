package com.neo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

public class Neon {
	
	public static void main(String[] args) {
		  int j=1;
		  String str="code";
		  StringBuilder sb=new StringBuilder();
		  for(int i=0;i<str.length();i++){
		    sb=sb.append(str.substring(0,j));
		    ++j;
		  }
		 System.out.println(sb);
}
	public static boolean doublexx(String str){

		  int i=0;
		  while(i<str.length()-1){
		   if(str.charAt(i)=='x'){
			   if(str.charAt(i+1)=='x') return true;
			   else break;
		   }
		    ++i;
		  }return false;

		
		
	}
	public static int noOfTimes(String str) {
		int count=0;
		int i=0;
		while(i<str.length()){
			if(i+2>str.length()) break;
			System.out.println(str.substring(i, i+2));
			if(str.substring(i, i+2).contains("xx")){
				count++;
			}
			++i;;
		}
		
		return count;
		
	}
	public static int[] reverse(int a[]){
		int[] reversedArray=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--){
			reversedArray[j]=a[i];
			++j;
		}
		
		return reversedArray;
	}
	
	public static void dateTimeCheck(){
		String myDateString = "13:24";
	    LocalTime localTime = LocalTime.parse(myDateString, DateTimeFormatter.ofPattern("HH:mm:ss"));
	    int hour = localTime.get(ChronoField.CLOCK_HOUR_OF_DAY);
	    int minute = localTime.get(ChronoField.MINUTE_OF_HOUR);
	    int second = localTime.get(ChronoField.SECOND_OF_MINUTE);

	    //prints "hour: 13, minute: 24, second: 40":
	    System.out.println(String.format("hour: %d, minute: %d, second: %d", hour, minute, second));
	}
	
	
	
	
	
	

}


final class Question_1_3 {
    private final int n;
    public Question_1_3() {
    	n=4;
    }
    public void setN(int n) {
    	
    }
}
