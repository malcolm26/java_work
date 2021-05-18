package linkedlist;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.*;
import java.util.Scanner;

public class MyRunner {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleList list = new PeopleList();
		
		
		list.printList();
		Scanner sc2 = null;
		try {
			sc2 = new Scanner(new File("Files2/people.txt"));
			
			while (sc2.hasNextLine()) {
	            Scanner s2 = new Scanner(sc2.nextLine());
		        while (s2.hasNext()) {
		            String s = s2.nextLine();
		            //stripQuotes(s);
		            String[] words = s.split("[,]");
		            String names = words[0];
		            int ages = Integer.parseInt(words[1]);
		            String emails = words[2];
		            Person p = new Person(names, ages, emails);
		            list.add(p);
		            //Person pp = new Person(s2, )
		            //System.out.println(s);
		        }
		        s2.close();
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
