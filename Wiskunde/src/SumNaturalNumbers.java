/**find the sum of the first 100 natural numbers
 * 
 * @author hdziedzic
 *
 */
public class SumNaturalNumbers {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum = sum + i;
			System.out.println(i);
		}
        System.out.println("Sum = " + sum);
	}

}
