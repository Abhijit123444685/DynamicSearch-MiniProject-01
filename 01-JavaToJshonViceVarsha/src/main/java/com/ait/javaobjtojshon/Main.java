package com.ait.javaobjtojshon;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
//		//Java Object To JSHON
		ObjectMapper obj=new ObjectMapper();
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		Employee e=new Employee(102,"Abhijit");
		Employee e1=new Employee(103,"Biswajit");
		Employee e2=new Employee(104,"RamaRaju");
//		
		al.add(e);
		al.add(e1);
		al.add(e2);
		String wt = obj.writeValueAsString(e);
		System.out.println(wt);
		
		obj.writeValue(new File("C:\\jshon file\\jshon.txt"),al);
		
		//JSHON to Java Object
		
	     obj.readValue(new File("C:\\jshon file\\jshon.txt"),ArrayList.class);
		
	     Iterator<Employee> it = al.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }
		
	}

}
