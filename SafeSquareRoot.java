package ProgrammingByDoing;

import java.util.Scanner;

public class SafeSquareRoot {
	public static void main (String[]args ) {
		Scanner keyboard = new Scanner(System.in);
		double n;
		double w;
		System.out.println("Voer een getal in waarvan u de wortel wil berekenen: ");
		n = keyboard.nextInt();
		if (n>0){
		System.out.println(Math.sqrt(n));
		}
	
		while (n<=0){
		System.out.println("Het getal moet groter zijn dan 0.");
		System.out.println("Voer een getal in waarvan u de wortel wil berekenen: ");
		n = keyboard.nextInt();
		w = Math.sqrt(n);
		if (n>0){
		System.out.println("De wortel is: " + w);
		}
	}
		keyboard.close();
	}
}