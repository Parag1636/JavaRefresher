package inheritanceAndPolymorphism;

public class MainClass {

	public static void main(String[] args) throws Exception {
		Animal a = new Animal();
		Horse b = new Horse();
		Dog d = new Dog();
		
		//Upcasting and Downcasting Exaamples 
		Animal a1 = new Dog(); //Upcasting
		a1.eat();
		((Dog) a1).bread("German Shephard");
		
// Explanation of Line 13 In simple Words below -----------------------
		
		Dog d2 = (Dog) a1; //DownCasting
		d2.bread("Pomelian");
		d2.eat();
		
//		a.eat();
//		b.eat();
//		b.buck("Hello");
//		b.legs(4);
//		b.legs(4, "Animal has 4 Legs");
		
		System.out.println("****************************************");
		Animal [] animalArray = {new Animal(), new Dog()};
		
		for(Animal anime : animalArray) {
			anime.eat();
			if(a instanceof Dog) {
				Dog d1 = (Dog) a;
				d1.bread("Pomelian");
			}
		}

	}

}
