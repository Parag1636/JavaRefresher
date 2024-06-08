package chapter1SecondPackage;
import Chapter1.*;

public class Tea extends Beverages {
	
	public void messageWelcome() {
		System.out.println("Hello I am From Class Tea.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea t = new Tea();
		t.messageWelcome();
		Beverages t1 = new Beverages();
		t1.messageWelcome();

	}

}
