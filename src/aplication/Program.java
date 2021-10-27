package aplication;

import static aplication.Calculator.PI;

import java.util.Scanner;

public class Program {
	

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = cal.circunfernce(radius);
		
		double v =  cal.volume(radius);
		
		System.out.printf("Circunference: %.2f%n" ,c);
		System.out.printf("Volume: %.2f%n" ,v);
		System.out.printf("PI: %.2f%n" ,PI);
		
		sc.close();

	}
	
	

}
