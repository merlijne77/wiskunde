

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

/* We're going to use what we've been
 *  learning to draw a famous fractal: the Sierpinski triangle. 
 *  You'll need to implement the following steps as seen on the
 *  website: www.programmingbydoing.com/sierpinski.
 *  There is a working version on programmingbydoing.com
 */
@SuppressWarnings("serial")
public class SierpinskiTriangle extends Canvas {
	
	//3 hoekpunten:
	int x1 = 512;
	int y1 = 109;
	int x2 = 146;
	int y2 = 654;
	int x3 = 876;
	int y3 = 654;
	
	//current point:
	int x = 512;
	int y = 382;
	
	int dx;
	int dy;
	
	int howManyTimes = 50000;
	
	Random r = new Random();
	
	public void paint( Graphics g ) {
		for (int i = 0; i<howManyTimes; i++){
			g.drawLine(x, y, x, y);
			try {
				Thread.sleep(0,00000000000000000000000000000000000000000000000000000000001);;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int c = r.nextInt(3)+1; //+1 omdat hij anders 0 ook doet. Een getal tussen 1 en 4
			
			if (c == 1) {
				dx = x - x1;
				dy = y - y1;
			}
			
			if (c == 2) {
				dx = x - x2;
				dy = y - y2;
			}
			
			if (c == 3) {
				dx = x - x3;
				dy = y - y3;
			}
			
			x = x - dx/2;
			y = y - dy/2;
		}
		g.drawString("Sierpinski Triangle", 462, 484);
	}
	
	public static void main (String[] args) {
		
		JFrame sierpinski = new JFrame("Sierpinski Triangle");
        sierpinski.setSize(1024,768);
        sierpinski.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sierpinski.add( new SierpinskiTriangle() );
        sierpinski.setVisible(true);
	}
}