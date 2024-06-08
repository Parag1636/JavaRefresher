package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("Srijan", 26);
		Person p2 = new Person("Aman", 25);
		Person p3 = new Person("Abhinav", 26);
		Person p4 = new Person("Ishan", 26);
		Person p5 = new Person("Priyansh", 25);
		Person p6 = new Person("Abhijeet", 26);
		Person p7 = new Person("Parag", 26);
		Person p8 = new Person("Vipin", 25);
		Person p9 = new Person("Prashu", 26);
		Person p10 = new Person("Aayush", 28);
		
		
		List<Person> person = new ArrayList<>();
		
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);
		person.add(p6);
		person.add(p7);
		person.add(p8);
		person.add(p9);
		person.add(p10);
		
		for(Person p : person) {
			System.out.println("Data from Person through For Each Loop :  "+p);
		}
		
		System.out.println("");
		
		Iterator<Person> iteratorPerson = person.iterator();
		while(iteratorPerson.hasNext()) {
			System.out.println("Data From Person through List Iterator : " + iteratorPerson.next());
//			if(iteratorPerson.equals("Parag")) {
//				person.se;
//				}
			}
	}

}
