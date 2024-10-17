package JavaCollections.ArrayListPrograms;

public class Employee {
	      String name;
	      int age;
	      String dpt;
	      
	      Employee(String name, int age, String dpt){
	    	  this.name = name;         // When you have same referance variable in constructor
	    	  this.age = age;              // we are assigning global variable equals to local variable.
	    	  this.dpt = dpt;   
	      }

}
