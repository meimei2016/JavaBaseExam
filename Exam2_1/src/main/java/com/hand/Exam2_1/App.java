package com.hand.Exam2_1;

import java.util.Scanner;

public class App {
    public static void main( String[] args ){   
    	System.out.print("请输入工资：");    	
    	Scanner c1=new Scanner(System.in);   	
    	double sal=c1.nextDouble();
    	c1.close();
    	double m=sal-3500;
    	double s=0;
    	double partTax=(4500-1500)*0.1+1500*0.03;
    	double partTax1=(35000-9000)*0.25+4500*0.2;
    	double partTax2=(80000-55000)*0.35+(55000-35000)*0.3;
    	if(m<0){
    		s=0;
    	}   	
    	if((0<m)&&(m<=1500)){
    		s=m*0.03;
    	}
    	if((1500<m)&m<=4500){
    		s=m*0.1+1500*0.03;    		
    	}
    	if((4500<m)&&(m<=9000)){
    		s=(m-4500)*0.2+partTax;   		
    	}
    	if((9000<m)&&(m<=35000)){
    		s=(m-9000)*0.25+4500*0.2+partTax;    		
    	}
    	if((35000<m)&&(m<=55000)){
    		s=(m-35000)*0.3+partTax1+partTax;   		
    	}
    	if((55000<m)&&(m<=80000)){
    		s=(m-55000)*0.35+(55000-35000)*0.3+partTax1+partTax;   		
    	}
    	if(80000<m){
    		s=(m-80000)*0.45+partTax2+partTax1+partTax;    		
    	}
        System.out.println( "所需缴纳的税费为:"+s );
    }
}

