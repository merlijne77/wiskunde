package ProgrammingByDoing;


import java.util.Scanner;

/**
 * 
 * Neem een willekeurig geheel getal n als beginwaarde en bereken een volgend
 * getal door de regels:
 *
 * als n even is, deel het door 2 als n oneven is, vermenigvuldig het met 3 en
 * tel er 1 bij op
 *
 * Het vermoeden is dat als men dit proces vaak genoeg herhaalt, men
 * uiteindelijk bij het getal 1 uitkomt. Dit vermoeden is voor het eerst
 * geformuleerd door Lothar Collatz in 1937. Tot op heden is het vermoeden nog
 * niet bevestigd of weerlegd.
 * 
 * Deze berekent een range aan getallen. De code zoveel mogelijk in methodes
 * gedaan.
 * 
 * @author hdziedzic
 *
 */
public class CollatzSequence5 {
	
	private static int stepsTaken;
	private static int width;
	private static int even = 2;
    private static int beginNumber;
	private static int finalNumber;
	private static int startNumber;
	private static int largest = 0;
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String welcome = "* Neem een willekeurig geheel getal n als beginwaarde"
				+ "\n en bereken een volgend getal door de regels:als n even is"
				+ ",\n deel het door 2 als n oneven is, vermenigvuldig het met"
				+ " 3\n en tel er 1 bij op. Het vermoeden is dat als men dit "
				+ "proces\n vaak genoeg herhaalt, men uiteindelijk bij het getal"
				+ " 1 \n uitkomt. Dit vermoeden is voor het eerst geformuleerd"
				+ " door \n Lothar Collatz in 1937. Tot op heden is het"
				+ " vermoeden nog \n niet bevestigd of weerlegd. Voer een "
				+ "beginnummer in waarmee \n we de berekening starten:\n ";
		String welcome2 = "Voer een eindnummer in: ";

		System.out.println(welcome);
		beginNumber = keyboard.nextInt();
		System.out.println(welcome2);
		finalNumber = keyboard.nextInt();
		int n = beginNumber;
		startNumber = beginNumber;
		
		while (n <= finalNumber) {//zolang n kleiner is dan finalNumber voer onderstaande uit
			
			collatz();//voer de methode collatz uit
			
			System.out.println(("\n\nStappen: ") + (stepsTaken)
					+ (" Grootste nummer ") + (largest));
			System.out.println("---------------------------------------------"
					+ "---------------------------");
			n++;
			startNumber++;
			beginNumber = n;
			stepsTaken = 0;
			largest = 0;
		}
	}

	private static void makingRows() {// methode om rijen van 10 te maken.
		if (width > 9) {
			System.out.print("\n");
			width = 0;
		}
	}

	private static void even() {
		System.out.print((beginNumber /= even) + "\t");// deelt n met outcome(2)
														// tot het geen even
														// nummer meer is
		stepsTaken++;
		width++;
		makingRows();
	}

	private static void oneven() {
		System.out.print((beginNumber = ((beginNumber * 3) + 1)) + "\t");
		stepsTaken++;
		width++;
		makingRows();
	}
	
	private static void collatz(){
		
		System.out.println(("NUMMER: ") + (startNumber)+ ("\n"));
		
		while (beginNumber != 1) {
			if (largest < beginNumber) {
				largest = beginNumber;
			}

			if (beginNumber % 2 == 0) {// als n even is voer uit
				even();
			}

			else {
				oneven();
			}
			
		}
	}
	}

