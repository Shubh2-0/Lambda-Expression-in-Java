package com.masai;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class LambdaExpressionDemo {
	
	
	public static void main(String[] args) {
		
	 
	List<Integer> list = Arrays.asList(50,37,29,40,52,10,24,98,21);
	
	
	System.out.println("PRINT ELEMENTS OF THE LIST USING LAMBDA");
	list.forEach( e -> System.out.println(e%2==0?"Number is Even : "+e:"Number is Odd : "+e));
	
	
	
	System.out.println("\n\nFILTERING USING STREAM AND LAMBDA");
	list.stream().filter(e -> e%2==0).forEach(e -> System.out.println(e));
	
	
	
	System.out.println("\n\nSORTING IN DESCENDING ORDER USING LAMBDA");
	Collections.sort(list , (o1,o2) -> o2-o1);
	list.forEach(e -> System.out.println(e));
	
	
	System.out.println("\n\nSORTING IN ASCENDING ORDER USING LAMBDA");
	Collections.sort(list , (o1,o2) -> o1-o2);
	list.forEach(e -> System.out.println(e));
	
	
	
	
	Map<String, Integer> map = new HashMap<>();
	map.put("Aman", 1);
	map.put("Prasant", 6);
	map.put("Boby", 3);
	map.put("Zen", 9);
	map.put("Jay", 2);
	map.put("Chinmay", 5);
	map.put("Harshit", 10);
	map.put("Lakhan", 4);
	map.put("Ram", 3);
	map.put("Dev", 7);
	
	System.out.println("\n\nPRINT ELEMENTS OF MAP USING LAMBDA");
	map.forEach((k,v) -> System.out.println("key :"+k+" \t Value : "+v));
	
	
	
	System.out.println("\n\nSORT THE MAP BY THIER VALUE IN DESCENDING ORDER USING LAMBDA");
	List<Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
    Collections.sort(entries , (o1,o2) -> o2.getValue()-o1.getValue());
    Map<String, Integer>  map2 = new LinkedHashMap<>();
    entries.forEach(e ->  map2.put( e.getKey() , e.getValue()) );
	map2.forEach((k,v) -> System.out.println("Key : "+k+" \t Value : "+v));
	
	
	System.out.println("\n\nSORT THE MAP BY THIER KEY IN DESCENDING ORDER USING LAMBDA");
	List<String> list3 = new ArrayList<>(map2.keySet());
	Collections.sort(list3 , (o1,o2) -> o2.compareTo(o1) );
    Map<String, Integer> map3 = new LinkedHashMap<>();
    list3.forEach(e -> map3.put(e, map2.get(e)));
    map3.forEach((k,v) -> System.out.println("Key : "+k+" \t Value : "+v));
    
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
	
	
	
	
	
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
