

/*Smiling Face Function
 *Write a function that displays a smiling face at a certain place on the screen. 
 *The function must be named as below, and it must be able to display the face anywhere on
 *the screen specified by the parameters x and y. You may borrow code from previous assignments
 *if you want, although it is probably better if the face is relatively small so you have room 
 *to draw several of them on the screen at once. 
 *Then, inside the paint() method, call the function a few times to draw several faces on the screen.
 */

import java.awt.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SmilingFaceFunction extends Canvas {

	public void paint(Graphics g) {
		// fills up the screen with the color pink
		g.setColor(Color.pink);
		g.fillRect(0, 0, getWidth(), getHeight());

		drawSmilingFace(g, 100, 200);// uses the method drawSmilingFace
		drawSmilingFace(g, 300, 600);
	}

	public void drawSmilingFace(Graphics g, int x, int y) {
		// Draws a smiling face on the screen, where the point (x,y) is
		// a box containing the face.
		g.setColor(Color.black);
		g.fillRect(x, y, 100, 100);
		// circle for the head
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 100, 100);
		// eyes
		g.setColor(Color.BLACK);
		g.fillOval(x + 30, y + 30, 10, 20);
		g.fillOval(x + 60, y + 30, 10, 20);
		// draw mouth
		g.drawArc(x + 20, y + 25, 60, 60, 200, 140);
	}

	public static void main(String[] args) {

		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024, 768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new SmilingFaceFunction());
		win.setVisible(true);
		
	}
}