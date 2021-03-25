/**find the sum of the first 100 natural numbers
 * 
 * @author hdziedzic
 *
 */
import java.util.Scanner;

public class SumNaturalNumbers {
	
	public static void main(String[] args) {
		
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		int firstNum = 0, secondNum = 0, highestNum = 0;
		
		
		for(int i = 0; i <= 5; i++) {
			
			System.out.println("Input number" + i + "and press enter:");
			firstNum = input.nextInt();
			System.out.println("Input number" + i + "and press enter:");
			secondNum = input.nextInt();
			if(secondNum > firstNum) {
				highestNum = secondNum;
			} else {
				highestNum = firstNum;
				
			}
			
			}
		
        System.out.print("Highest Number =" + highestNum);
	}}


