package linkedlist;

public class Person {
		/*
		 * declare instance fields to be used in program
		 */
		private String name;
		private int age; 
		private String email;
		private int bankingNumber;
		
		public Person(String newName, int newAge, String newEmail)
		{
			name = newName;
			age = newAge;
			email = newEmail;
			//bankingNumber = newBank;
		}	// end constructor program
		
		public String toString()
		{
			return "Name: " + name + ", Age: " + age + ", Email: " + email;
		}	// end method string

}
