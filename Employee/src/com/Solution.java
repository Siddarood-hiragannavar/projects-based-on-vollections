package com;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;


public class Solution {
	
	public static void main(String[] args) {
		Employee e1=new Employee(100,"sachin",35000.0);
		Employee e2=new Employee(200,"sid",55000.0);
		Employee e3=new Employee(200,"ravi",45000.0);
		Map<Integer,Employee>map=new LinkedHashMap<Integer,Employee>();
		map.put(e1.id, e1);
		map.put(e2.id, e2);
		map.put(e3.id, e3);
		
		Set<Integer>Keys=map.keySet();//100,200,300
		
		//converting map in to a set
		Set<Integer>Keys1=map.keySet();
		//reference variable of list & object of ArrayList Storing Stufdent objects
		List<Employee>list=new ArrayList<Employee>();
		//traversing using for each loop
		for(int key:Keys1)
		{
		
			Employee std=map.get(key);//getting Student object (value) ->get()
			list.add(std);//adding the values (student object) into the list
			System.out.println(std);//printing the three values(Student objects
		}
		
		
	}



		
	}


