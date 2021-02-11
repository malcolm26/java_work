package linkedlist;

public class Person {
		/*
		 * declare instance fields to be used in program
		 */
		private String name;
		private int age; 
		
		public Person(String newName, int newAge)
		{
			name = newName;
			age = newAge;
		}	// end constructor program
		
		public String toString()
		{
			return "Name: " + name + ", Age: " + age;
		}	// end method string

}
