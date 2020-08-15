/*Xs and Ys
 * 
 * Write another program that uses a for loop. With the loop, make the 
 * variable x go from -10 to 10, counting by 0.5. (This means that x can't be
 *  an int.)Inside the body of the loop, make another variable y become the 
 *  current value of x squared. Then display the current values of both x and y.
 *  www.programmingbydoing.com
 */
package ProgrammingByDoing;

public class XY {
	public static void main(String[] args) {
		for (double x=-10; x<=10; x=x+0.5){
	        double y = x * x;
	        System.out.println(x + "\t"+y);
		}
	}
}
