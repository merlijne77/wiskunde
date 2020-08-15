/**
 *Multiplication Table
 *Use nested for loops to generate a multiplication table,
 *which should go all the way up to 12x9 
 * 
 * 
 *for assignment: www.programmingbydoing.com
 * 
 */



public class MultificationTable {
	public static void main(String args[]) {

		int x = 1;
		int y = 1;

		for (int columnnummer = 0; columnnummer <= 9; columnnummer++) {
			if (columnnummer < 1) {
				System.out.print("x |" + "\t");
			} else {
				System.out.print(columnnummer + "\t");
			}
		}
		
		System.out.println("\n==========================================================================");

		for (int indexNummer = 1; indexNummer <= 12; indexNummer++) {

			if (indexNummer < 10) {
				System.out.print(indexNummer + " |" + "\t");
			} else {
				System.out.print(indexNummer + "|" + "\t");
			}
				
				for (int b = 0; b < 9; b++) {
					System.out.print(x * y + "\t");
					y++;
				}
			
			y = 1;
			x++;
			System.out.println();//test for bitbucket
		 }
	}
}
