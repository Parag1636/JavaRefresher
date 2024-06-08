package inheritanceAndPolymorphism;

public class Dog extends Animal{
	public void eat() throws Exception{
		System.out.println("Eating is from Dog Classes");
	}
	
	void bread(String st) {
		System.out.println("Bread of the Dog is : " + st);
	}
}
