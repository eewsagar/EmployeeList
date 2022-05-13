package com.main.list;


import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {
	public static void main(String[] args) {
		Employee[] emp =  new Employee[4];
		emp[0] =  new Employee("Sachin", "Chennai", 30);
		emp[1] =  new Employee("Vijay", "Chennai", 30);
		emp[2] =  new Employee("Ajith", "Mumbai", 30);
		emp[3] =  new Employee("Kamal", "Mumbai", 30);
		
		ArrayList<Employee> em  =  new ArrayList<Employee>();
		em.add(emp[0]);
		em.add(emp[1]);
		em.add(emp[2]);
		em.add(emp[3]);
		
		// using prior java 8
		
		 Collections.sort(em, new Comparator<Employee>() {

	            @Override
	            public int compare(Employee employee1, Employee employee2) {
	                return employee1.getEname().compareTo(employee2.getEname());
	            }

	        });
		 for (Employee employee : em) {

             System.out.println(employee);
         }
		 
		 HashMap<String, List<Employee>> map = new HashMap<String, List<Employee>>();
		 for (Employee emps : em) {
			    String key  = emps.getEcity();
			    if(map.containsKey(key)){
			        List<Employee> list = map.get(key);
			        list.add(emps);

			    }else{
			        List<Employee> list = new ArrayList<Employee>();
			        list.add(emps);
			        map.put(key, list);
			    }

			}
		 
		 for (Map.Entry<String,List<Employee>> entry : map.entrySet()) {
			 //System.out.print("Employee in = " + entry.getKey());
			 List<Employee> e =    entry.getValue();
			 String empname="";
			  for(Employee empss :  e) {
				 empname =  empname+" and " +empss.getEname(); 
			  }
			  System.out.println("Employee in " + entry.getKey()+" in alphabetical order "+empname);
		 }

		 //using java 8
		 
		
	
		 //Map<String, List<Employee>> groupByPriceMap =  em.stream().collect(Collectors.groupingBy(Employee::getCity));
		 Map<String, List<Employee>> groupByCity =  em.stream().
				 collect(Collectors.groupingBy(Employee::getEcity)); 
		 
		 for (Map.Entry<String,List<Employee>> entry : groupByCity.entrySet()) {
			 //System.out.print("Employee in = " + entry.getKey());
			 List<Employee> e =    entry.getValue();
			 String empname="";
			  for(Employee empss :  e) {
				 empname =  empname+" and " +empss.getEname(); 
			  }
			  System.out.println("Employee in " + entry.getKey()+" in alphabetical order "+empname);
		 }
         

	}

}
