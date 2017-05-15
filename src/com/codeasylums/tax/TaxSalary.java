package com.codeasylums.tax;
import java.util.*;
class Employee{
	private int salary;
	private int age;
	private String name;
	Employee(int age,String name,int salary){
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	public void setName(String s){
		name=s;
	}
	public void setage(int a){
		age=a;
	}
	public void setSalary(int b){
		salary=b;
	}
	public int getSalary(){
		return salary;
	}
	
}
class taxCalculator{
public	NavigableMap<Integer,Integer> mp=new TreeMap<Integer,Integer>();
	public int getTaxPercentage(int salary){		
		if(salary<200000){
			mp.put(0,0);
			
		}
		else if(salary<500000){
			mp.put(200000,10);
		}
		else {
			mp.put(500000, 20);
		}
		return mp.floorEntry(salary).getValue();
		
	}
	
	
	public float getActualTax(int salary){
		return ((getTaxPercentage(salary)*salary*1.0f)/100);
	}
}
class taxSalary{
	public static void main(String argf[]){
		Employee e1=new Employee(10,"mayank",10000);
		Employee e2=new Employee(11,"ruchit",20000);
		Employee e3=new Employee(12,"pwowp",4044094);
		e3.setage(18);
		e3.setName("popo");
		e3.setSalary(10000000);
		ArrayList<Employee> x=new ArrayList<Employee>();
		x.add(e1);
		x.add(e2);
		x.add(e3);
		Iterator i=x.iterator();
		while(i.hasNext()){
			Employee d=(Employee)i.next();
			taxCalculator f=new taxCalculator();
	        System.out.println("the tax of employee1 is"+f.getActualTax(d.getSalary()));
		}
	}
}
