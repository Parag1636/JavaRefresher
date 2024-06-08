package inheritanceAndPolymorphism;

public class Horse extends Animal{

	public void eat() throws Exception{
		super.eat();
		System.out.println("Eating is from Horse Classes");
	}
	
	public String buck(String st) throws Exception {
		System.out.println(st + " From Horse Class");
		return st;
	}
	
	public void legs(int l) {
		System.out.println("Legs of Horse : " + l);
	}
	
	public void legs(int l, String s) {
		System.out.println("Legs of Horse : " + l);
		System.out.println("Horse : " + s);
	}
}
