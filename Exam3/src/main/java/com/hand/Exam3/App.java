package com.hand.Exam3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("请输入日期:");
    	Scanner s=new Scanner(System.in);
    	String date=s.nextLine().trim();
    	String m[]=date.split("-");
    	boolean boo=false;
    	int y=Integer.valueOf(m[0]);
    	if((y%100==0)&&(y%400==0)){
    		boo=true;
    	}else if((y%100!=0)&&(y%4==0)){
    		boo=true;
    	}
    	int i=0;
    	switch(Integer.valueOf(m[1])){
    	case 1:
    		System.out.println( "你输入的日期为当年的第"+Integer.valueOf(m[2])+"天" );
    		break;
    	case 2:
    		System.out.println( "你输入的日期为当年的第"+Integer.valueOf(m[2])+31+"天" );
    		break;
    	case 3:    		
    		if(boo){
    			i=Integer.valueOf(m[2])+31+29;	
    		}else{
    			i=Integer.valueOf(m[2])+31+28;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	case 4:	
    		if(boo){
    			i=Integer.valueOf(m[2])+31*2+29;	
    		}else{
    			i=Integer.valueOf(m[2])+31*2+28;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	case 5:
    		if(boo){
    			i=Integer.valueOf(m[2])+31*2+29+30;	
    		}else{
    			i=Integer.valueOf(m[2])+31*2+28+30;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	case 6:
    		if(boo){
    			i=Integer.valueOf(m[2])+31*3+29+30;	
    		}else{
    			i=Integer.valueOf(m[2])+31*3+28+30;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	case 7:
    		if(boo){
    			i=Integer.valueOf(m[2])+31*3+29+30*2;	
    		}else{
    			i=Integer.valueOf(m[2])+31*3+28+30*2;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	case 8:
    		if(boo){
    			i=Integer.valueOf(m[2])+31*4+29+30*2;	
    		}else{
    			i=Integer.valueOf(m[2])+31*4+28+30*2;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	case 9:
    		if(boo){
    			i=Integer.valueOf(m[2])+31*5+29+30*2;	
    		}else{
    			i=Integer.valueOf(m[2])+31*5+28+30*2;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	case 10:
    		if(boo){
    			i=Integer.valueOf(m[2])+31*5+29+30*3;	
    		}else{
    			i=Integer.valueOf(m[2])+31*5+28+30*3;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	case 11:
    		if(boo){
    			i=Integer.valueOf(m[2])+31*6+29+30*3;	
    		}else{
    			i=Integer.valueOf(m[2])+31*6+28+30*3;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	case 12:
    		if(boo){
    			i=Integer.valueOf(m[2])+31*6+29+30*4;	
    		}else{
    			i=Integer.valueOf(m[2])+31*6+28+30*4;
    		}
    		System.out.println( "你输入的日期为当年的第"+i+"天" );
    		break;
    	}
    }
}
