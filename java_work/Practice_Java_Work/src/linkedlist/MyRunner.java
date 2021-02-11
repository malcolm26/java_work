package linkedlist;

import java.io.*;
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
		            String[] words = s.split("[,]");
		            String names = words[0];
		            int ages = Integer.parseInt(words[1]);
		            Person p = new Person(names, ages);
		            list.add(p);
		            //Person pp = new Person(s2, )
		            //System.out.println(s);
		        }
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
