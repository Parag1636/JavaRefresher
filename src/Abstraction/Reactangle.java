package Abstraction;

import java.util.Scanner;

public class Reactangle extends shape{
	public static Double length, breadth;
	
	@Override
	void edges() {
		System.out.println("Reactangle has 4 edges");
	}

	@Override
	Double perimetre() {
		// TODO Auto-generated method stub
		Double result = 2*(length + breadth);
		System.out.println("Perimetre of Reactangle : " + result);
		return result;
	}
	
	@Override
	protected String Dimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double area() {
		// TODO Auto-generated method stub
		double result = length * breadth;
		System.out.println("Area of Reactangle : " + result);
		return result;
	}

	@Override
	Double radius() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	Double volume() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Provide input for the Reactangle");
		System.out.println("----------------------------------------");
		System.out.println("Please provide length of Reactangle");
		length = sc.nextDouble();
		System.out.println("Please provide Breadth of Reactangle");
		breadth = sc.nextDouble();
		sc.close();
		Reactangle react = new Reactangle();
		react.edges();
		react.perimetre();
		react.area();
	}
}
