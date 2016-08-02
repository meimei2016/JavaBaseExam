package com.hand.Exam4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class App {
    public static void main( String[] args ){    
    	App app=new App();
    	List<Integer> list=app.getRandomList(50, 100);
    	Map<Integer,List<Integer>> map=app.getMap(10, list); 
    	System.out.print("Map中的数据为：{");
    	app.printMap(map);
    	for(Integer k:map.keySet()){
    		map.put(k, app.getSort(map.get(k)));
    	}
    	System.out.print("排序后的 Map为：{");
    	app.printMap(map);
    }
    public  List<Integer> getRandomList(int size, int upScale){
    	List<Integer> list =new ArrayList<Integer>();
    	Random random=new Random();
    	System.out.print("随机生成的50个小于100的整数，分别为：");
    	for(int i=0;i<size;i++){
   		   int j=random.nextInt(upScale);
   		   list.add(j);
   		   if(i!=size-1){
   			System.out.print(j+",");
   		   }else{
   			System.out.print(j); 
   		   }   		
    	}
    	System.out.println(); 
    	return list;
    }
    public List<Integer> getSort(List<Integer> list){
    	List<Integer> lis=list;
    	for(int i=0;i<lis.size();i++){
    		for(int j=i+1;j<lis.size();j++){
    			if(lis.get(i)>lis.get(j)){
    				int m=lis.get(i);
    				lis.set(i,lis.get(j));
    				lis.set(j,m);
    			}    			
    		}
    	}
    	return lis;   	
    }
    public Map<Integer, List<Integer>> getMap(int maxMapSize,List<Integer> list){
    	Map<Integer, List<Integer>> map=new HashMap<Integer, List<Integer>>();
    	for(int i=0;i<maxMapSize;i++){
    		List<Integer> list1 =new ArrayList<Integer>();
    		int key=-1;
    		for(int lis:list){
    			if(lis/10==i){
    				list1.add(lis);
    				key=lis/10;
    			}    			
    		}
    		if(key!=-1){
    			map.put(i, list1);
    		}    		
    	}
    	return map;
    }
    public void printMap(Map<Integer, List<Integer>> map){    	
    	List<String> list2=new ArrayList<String>();
    	for(int i:map.keySet()){
    		String s1=i+"=>[";
    		String s2="";
    		List<Integer> list1=map.get(i);
    		if(list1.size()>0){    			
    			for(int j=0;j<list1.size();j++){
    				if(j!=list1.size()-1){
    					s2=s2+list1.get(j)+",";
    				}else{
    					s2=s2+list1.get(j)+"]";
    				}
    			}    			
    		}
    		list2.add(s1+s2);
    	}    	
    	for(int i:map.keySet()){
    		if(i!=list2.size()-1){
    			System.out.print(list2.get(i)+",");
    		}else{
    			System.out.print(list2.get(i)+"}");
    		}
    	} 
    	System.out.println();
    }
}
