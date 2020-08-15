package ProgrammingByDoing;

/*Modify your previous program so that each of your 500 random triangles is the same size and shape.
 * Choose a random color as before. Then choose a single x and y value for one vertex. (vertex=toppunt in dutch)
 * Then, you must compute the positions of the other two vertices. For a right triangle (which is easiest),
 * if the upper-left vertex is at (x,y), then the lower-left vertex will be at (x,y+50)
 * and the lower-right vertex will be at (x+50,y+50). See the diagram below.
 *         a (x,y)
 *            |\
 *            | \
 *            |  \
 *            |   \
 *            |    \
 *            -------
 * b(x,y+50)         c (x+50,Y+50)
 * 
 * If you don't choose your first point correctly, then part of the triangle won't fit on the screen. 
 * Make sure you choose small enough x- and y-values to make sure that all of the triangle is showing.

Here is a working example version: www.programmingbydoing.com (RandomRightTriangles)
 * 
 * 
 */
 

import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.util.Random;

@SuppressWarnings("serial")
public class RandomRightTriangles extends Canvas {
	static final int DEFAULT_NUMBER_OF_TRIANGLES = 500;
	static Random r = new Random();
	static int numberOffTriangles = DEFAULT_NUMBER_OF_TRIANGLES;
	static int colorRange = 250; // not 255. 255 is white on white background
	static int maxTriangleSize = 710; // so it always fitts on the canvas
	
	public void paint( Graphics g ){
		for (int x = 0; x<numberOffTriangles; x++){
		 	Polygon triangle = new Polygon();
		 	
		 	// A coordinates (x,y vertex,toppunt)
		 	int Ax = r.nextInt(maxTriangleSize)+5;//+5 so it fitts on the canvas
		 	int Ay = r.nextInt(maxTriangleSize);
		 	
		 	// B coordinates
		 	int Bx = Ax;
		 	int By = Ay + 50;
		 	
		 	// C coordinates
		 	int Cx = Ax + 50;
		 	int Cy = Ay + 50;
		 	
		 	if (!(		(Ax == Bx && Ay == By)//Als de coordinaten NIET gelijk zijn voert hij onderstaande code uit
		 			||  (Ax == Cx && Ay == Cy)//Als de coordinaten gelijk zijn heb je geen driehoek namelijk.
		 			||  (Bx == Cx && By == Cy)
		 		))
		 	{
			 	triangle.addPoint(Ax, Ay);
		        triangle.addPoint(Bx, By);
		        triangle.addPoint(Cx, Cy);
		        // set random RBG colors, given a certain range.
		        Color colors = new Color(r.nextInt(colorRange), 
		        		r.nextInt(colorRange), 
		        		r.nextInt(colorRange));
		        g.setColor(colors);
		        g.fillPolygon(triangle); 
		 	}
		}
    }

	public static void main(String[] args)
	{
        JFrame winnew = new JFrame("Triangles");
        winnew.setSize(800,800);
        winnew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        winnew.add( new RandomRightTriangles() );
        winnew.setVisible(true);
        numberOffTriangles = DEFAULT_NUMBER_OF_TRIANGLES;
	}
}