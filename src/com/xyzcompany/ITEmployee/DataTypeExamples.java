package com.xyzcompany.ITEmployee;

public class DataTypeExamples extends Object{
	
	int a = 10;
	int b = 20;
	
	int add(int a,int b)
	{
		String display = toString();
		System.out.println(display);
		return a+b;
		
	}  
	int add(int a,int b,int c)
	{
		return a+b+c;
		
	} 
	
	//DataTypeExamples --object
	//Object --object
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The values are "+a +"and "+b;
	}
	


	public static void main(String[] args) {
		//object creation
		
		DataTypeExamples dataTypeExamples = new DataTypeExamples();
	
		int result = dataTypeExamples.add(3, 5);
		System.out.println(result);
		
	}

}
