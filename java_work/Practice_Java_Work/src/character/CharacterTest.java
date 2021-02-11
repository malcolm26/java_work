package character;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import linkedlist.Person;

public class CharacterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String[] vowels = {"i", "y", "a","o", "e", "u"};
		
		String[] alphabet = {"a","b","c","d","e",
											"f","g","h","i","j",
											"k","l","m","n","o",
											"p","q","r","s","t",
											"u","v","w","x","y","z"};
		CharacterList charList = new CharacterList();
		Character aChar = new Character("w");
		
		for(i = 0; i < vowels.length; i++) {
			Character people = new Character(vowels[i]);
			charList.add(people);
		}
		//charList.buildList();
		charList.add(aChar);
		charList.buildList();
		charList.add(new Character("q"));
		
		try {  
			File file=new File("Files/Demo.txt");    //creates a new file instance  
			FileReader fr=new FileReader(file);   //reads the file  
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
			StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
			String line;  
			while((line=br.readLine())!=null)  
			{  
				sb.append(line);      //appends line to string buffer  
				sb.append("\n");     //line feed   
			}  
			fr.close();    //closes the stream and release the resources  
			System.out.println("Contents of File: ");  
			System.out.println(sb.toString());   //returns a string that textually represents the object  
		}  
		catch(IOException e) {  
			e.printStackTrace();  
		}  

		//charList.delete("i");
		
		
		
		


	}

}
