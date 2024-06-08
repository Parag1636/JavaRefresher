package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListConcoureentExceptionExample {
public static void main(String[] args) {
		
		
		
		List<String> person = new ArrayList<>();
		
		person.add("Abhinav");
		person.add("Aman");
		person.add("Srijan");
		person.add("Himanshu");
		person.add("Parag");
		person.add("Abhijeet");
		person.add("Priyansh");
		person.add("Ishan");
		person.add("Vipin");
		person.add("Prashu");
		
		List<String> cloned = new CopyOnWriteArrayList<>(person);
		
		System.out.println("***************************************************");
		System.out.println("");
		
		for(String p : person) {
			System.out.println("Data from Person through For Each Loop :  "+p);
//			if(p.equals("Priyansh")) {
//			person.remove(5);
//			person.add("New");
//			}
		}
		
		System.out.println("***************************************************");
		System.out.println("");
		
		for(String c : cloned) {
			System.out.println("I am cloned " + c);
			if(c.equals("Priyansh")) {
				person.remove(5);
				person.add("New");
				}
		}
		
		System.out.println("***************************************************");
		System.out.println("");
		
		Iterator<String> iteratorPerson = person.iterator();
		while(iteratorPerson.hasNext()) {
			//person.remove(5);
			System.out.println("Data From Person through List Iterator : " + iteratorPerson.next());
			
			}
		System.out.println("***************************************************");
	}

}
