
import java.util.Scanner;

public class AreaAndVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.14159265359;
		Scanner input = new Scanner(System.in);
		
		//You see i have imported the Scanner class from java utility's. 
		//Than in the main method of youre class we make a new Scanner object
		//and we called it: input. (System.in) is a parameter for the constructor
		//of the scanner class. The constructor is a part of the class that is called when
		//we make a new object of Scanner class by using the keyword: new. 
		//By giving this parameter (System.in) to the constructor, we tell the object
		//that we want to receive INPUT from
		//keyboard. On this object (called input) you can use youre methods like you did in
		//the code you showed me:
		
		double radius = input.nextDouble();
		double volume = input.nextDouble();
		
		System.out.println(radius + " - " + volume);
	}

}
