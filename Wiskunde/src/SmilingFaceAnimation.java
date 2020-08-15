

//animatie smiley knipoog
//vragen of wim of ben even mee wil kijken waarom hij het niet goed doet

import java.awt.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SmilingFaceAnimation extends Canvas{
	public static JFrame win = new JFrame("Smiling Face Function");

	public void paint( Graphics g ){
		for(int i=0; i<10; i++) {
        drawSmilingFace(g,400,300);//Gebruikt de gelijknamige methode
        try {
			Thread.sleep(100);//pauze van 1000 microseconden
		}
         catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        win.repaint();
        drawWink(g,400,300);//gebruikt de gelijknamige methode
        try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        drawSmilingFace(g, 400,300);//terug naar de open ogen
        win.repaint();
        }
	}

	public void drawSmilingFace( Graphics g, int x, int y ){
		
		// Draws a smiling face on the screen, where the point (x,y) is
		//a box containing the face.
		g.setColor(Color.black);
		g.fillRect(x,y,100,100);
		//circle for the head
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 100, 100);
		//eyes
		g.setColor(Color.BLACK);
		g.fillOval(x+30, y+30, 10, 20);
		g.fillOval(x+60, y+30, 10, 20);
		// draw mouth
		g.drawArc(x+20,y+25,60,60,200,140);
	}

	public void drawWink(Graphics g, int x, int y) {
		// Draws a black box on the screen, where the point (x,y) is
				//a box containing the face.
				g.setColor(Color.black);
				g.fillRect(x,y,100,100);
				//circle for the head
				g.setColor(Color.YELLOW);
				g.fillOval(x, y, 100, 100);
				//eyes
				g.setColor(Color.BLACK);
				g.fillOval(x+30, y+30, 10, 20);
				g.fillOval(x+60, y+30, 10, 5);
				// draw mouth
				g.drawArc(x+20,y+25,60,60,200,140);
	}
	
	public static void main(String[] args) {
		
		// You can change the title or size here if you want.
		
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceAnimation() );
		win.setVisible(true);
	}
}