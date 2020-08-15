
import java.util.Scanner;

public class RightTriangleChecker {
	public static void main (String [] args){
		Scanner keyboard = new Scanner(System.in);
		int side1;
		int side2;
		int side3;
		
		System.out.println("You give me the length of three triangle sides.");
		System.out.println("This program will check if it's a right triangle.");
		System.out.println("Give me the length of side one: ");
		side1 = keyboard.nextInt();
		
		while (side1<0){
			System.out.println("It can't be smaller than 0, try again:");
			side1 = keyboard.nextInt();
		}
		
		System.out.println("Give me the length of side 2: ");
		side2 = keyboard.nextInt();
		
		while (side2<side1){
			System.out.println("side 2 can't be smaller than side1, try again:");
		}
		
		System.out.println("Give me the length of side 3: ");
		side3 = keyboard.nextInt();
		
		while (side3<side2){
			System.out.println("Side 3 can't be smaller than side"
					+ " 2, try again:");
			side3 = keyboard.nextInt();
		}
		double right = Math.sqrt(side1 * side1 + side2 * side2);
		
		if (side3==right){
			System.out.println("This is a right triangle!");
		}
		else {System.out.println("Not a right triangle...");
		
		}
	keyboard.close();
	}
}
