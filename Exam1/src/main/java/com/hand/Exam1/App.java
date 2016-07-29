package com.hand.Exam1;

import java.util.ArrayList;
import java.util.List;


public class App {
  
    public static void main( String[] args )
    {
    	int total=0;
    	List<Integer> list=new ArrayList<Integer>();
    	boolean s=true;
    	for(int i=101;i<=200;i++){
    		s=true;
    		for(int j=2;j<i;j++){
    			if((i%j)==0){
    				s=false;
    				break;
    			}   			
    		}
    		if(s){
    			list.add(i);
    			total=total+1;    			
    		}    		
    	}
        System.out.print( "101-200间总共有"+total+"个素数，分别是" );
        for(int i=0;i<list.size();i++){
        	if(i==list.size()-1){
        		System.out.print(list.get(i));
        	}
        	else{
        		System.out.print(list.get(i)+",");
        	}      	
        }
    }
    
}
