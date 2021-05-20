/**
 * 
 */
package com.xyzcompany.ITEmployee;

/**
 * @author Raaju Gaddam
 *
 */
public class Developer {
	
	 public Developer(String name, int id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public Developer(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Developer(String name) {
		this.name = name;
	}

	 String name;
	 int id;
	 String address;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Developer developer = new Developer("Pulkit");
 System.out.println(developer.name); //print statement
 Developer developer1 = new Developer("Raju",1001);
 System.out.println(developer1.name + developer1.id);
 Developer developer3 = new Developer("tiru",1002,"USA");
 System.out.println(developer3.name + developer3.id + developer3.address);
 
 
	}

}
