package Chapter1;

public class Clidlet extends Clidder{
	public final void flipper() {
		System.out.println("I am Clidder from Public method");
	}
	
	void do2() {
		System.out.println("Class Clidlet");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Clidlet().flipper();
		Clidder x1 = new Clidder();
		Clidder x2 = new Clidlet();
		Clidlet y = new Clidlet();
		((Clidlet)x2).do2();
		
	}

}
