package com.hand.Exam3_1;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main( String[] args ){
    	App app=new App();
    	System.out.println("请输入日期:");
    	Scanner s=new Scanner(System.in);
    	String date=s.nextLine().trim();
    	s.close();
    	String m[]=date.split("-");
    	int year=-1;
    	boolean legal=true;
    	boolean leapYear=false;
    	try{
    		year=Integer.valueOf(m[0]);
    		leapYear=app.leapYearCheck(year);
    		legal=app.dateCheck(date, leapYear);
    	}catch(NumberFormatException e){
    		legal=false;
    	}
    	if(legal){
    		int y=Integer.valueOf(m[1]);
    		int total=0;   	
        	int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        	int b[]={31,29,31,30,31,30,31,31,30,31,30,31};        	    	
        	if(leapYear){
        		for(int i=0;i<y;i++){
        			total=total+b[i];
        		}
        	}else{
        		for(int i=0;i<y;i++){
        			total=total+a[i];
        		}
        	}
        	System.out.println( "你输入的日期为当年的第"+total+"天" );
    	}else{
    		System.out.println( "你输入的日期格式不对" );
    	}
    }
    public boolean dateCheck(String date,boolean isLeapYear){
    	String m[]=date.split("-");  	
    	boolean legal =true;
    	if(m.length>3){
    		legal=false;
    		return legal;
    	}else if(!Pattern.matches("^[0-9]*[1-9]-[0-1][1-9]-[0-3][0-9]$", date)){
    		legal=false;
    		return legal;
    	}else if(Integer.valueOf(m[1])>12){
    		legal=false;
    		return legal;
    	}else if((Integer.valueOf(m[2]))>31||(Integer.valueOf(m[2])==0)){
    		legal=false;
    		return legal;
    	}
    	else {
    		if(isLeapYear&&(Integer.valueOf(m[1])==2)&&(Integer.valueOf(m[2])>29)){
    			legal=false;
    			return legal;
    		}    		
    		if(!isLeapYear&&(Integer.valueOf(m[1])==2)&&(Integer.valueOf(m[2])>28)){
    			legal=false;
    			return legal;
    		}
    	}
    	return legal;
    }
    public boolean leapYearCheck(int year){
    	boolean leapYear=false;
    	if((year%100==0)&&(year%400==0)){
    		leapYear=true;
    	}else if((year%100!=0)&&(year%4==0)){
    		leapYear=true;
    	} 
    	return leapYear;
    }
}

