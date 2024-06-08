package inheritanceAndPolymorphism;

public class useOfInstanceOfKeyword {

	public static void main(String[] args) {
		SampleClass sc1 = new SampleClass();
		SampleClass sc2 = new SampleClass();
		
		if(!sc1.equals(sc2)) {
			System.out.println("!sc1.equals(sc2)");
			sc1.welcomeMessage();
		}
		
		if(sc1 instanceof Object) {
			System.out.println("When Instance of True");
			sc1.welcomeMessage();
		}
	}
}
