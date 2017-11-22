import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("names.txt"));
		
		ArrayList<Person> persons = new ArrayList<>();
		
		while(sc.hasNextLine()){
			Person p = new Person(sc.nextLine());
			persons.add(p);
		}
		
		Collections.sort(persons);
		
		for(Person p : persons){
			System.out.println(p.getFullName());
		}
		
		sc.close();
	}
}
