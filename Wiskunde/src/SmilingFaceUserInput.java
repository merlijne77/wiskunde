


//Weer de smiley face functie alleen nu kan de user een aantal invoeren.
//Dat word dan het aantal smileys dat getoont word op het canvas.


import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SmilingFaceUserInput extends Canvas {
	public static int aantal;//aantal smileys in te voeren door user
	public static Random r = new Random();//nieuw random object
	public static Scanner keyboard = new Scanner(System.in);//nieuw scanner object
	public static int x;//x-as
	public static int y;//y-as
	public static int maxXLength = 1800;//maximum waarde van de x as waarop een smiley gemaakt word.
	public static int maxYLength = 1000;//maximum waarde van de y as waarop een smiley gemaakt word.
	

	public void paint(Graphics g) {
		// fills up the screen with the color pink
				g.setColor(Color.pink);
				g.fillRect(0, 0, getWidth(), getHeight());
		for (int i = 0; i < aantal; i++) {//deze for loop zorgt ervoor dat er zoveel smileys gemaakt worden als ingevoerd is
			drawSmilingFace(g, x, y);//hier word drawSmilingFace methode gebruikt
		}
	}

	public void drawSmilingFace(Graphics g, int x, int y) {
		x = r.nextInt(maxXLength);
		y = r.nextInt(maxYLength);

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
		do {
		    System.out.println("How many smiley faces do you want? \n Enter a "
		    		+ "number between 1 and 50000.\n And press Enter: ");
		    while (!keyboard.hasNextInt()) {//als het geen integer is
		        System.out.println("That's not a number!");
		        keyboard.next(); // this is important!
		    }
		    aantal = keyboard.nextInt();
		} while (aantal <= 0 || aantal > 50000);//terwijl aantal kleiner of gelijk is aan 0 of aantal groter is dan 50000
		
		// You can change the title or size here if you want.
		keyboard.close();
		JFrame win = new JFrame("Smiling Face Function");//Hier maakt hij een nieuw frame object aan
		win.setSize(1024, 2024);//Hier word de grote van het frame bepaald
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Als men op kruisje drukt beeindigd het frame
		win.add(new SmilingFaceUserInput());//alles in deze klasse word toegevoegd aan het frame
		win.setVisible(true);
	}
}