package ProgrammingByDoing;



import java.awt.*;

import javax.swing.JFrame;

import java.awt.Polygon;
import java.util.Random;

@SuppressWarnings("serial")
public class RandomTriangles extends Canvas {
	static final int DEFAULT_NUMBER_OF_TRIANGLES = 500;
	static Random r = new Random();
	static int numberOffTriangles = DEFAULT_NUMBER_OF_TRIANGLES;
	static int colorRange = 250; // not 255. 255 is white on white background
	static int maxTriangleSize = 800; // 800 is default size
	/**
	 *  Draw multiple random triangles each having a random color.
	 *  
	 * Requisite:
	 * The x,y coordinates of each cornet of the triangle can not
	 * have the same x,y coordinates.
	 * 
	 *   Example:
	 *   
	 *   A   
	 *   |\ 
	 *   | \
	 *   |  \
	 *   |___\
	 *   B     C
	 * 
	 *   Required:
	 *   A(x,y) =/= B(x,y)
	 *   A(x,y) =/= C(x,y)
	 *   B(x,y) =/= C(x,y) 
	 *   	
	 */
	
	public void paint( Graphics g )
    {
		for (int x = 0; x<numberOffTriangles; x++){
		 	Polygon triangle = new Polygon();
		 	
		 	// A coordinates
		 	int Ax = r.nextInt(maxTriangleSize);
		 	int Ay = r.nextInt(maxTriangleSize);
		 	
		 	// B coordinates
		 	int Bx = r.nextInt(maxTriangleSize);
		 	int By = r.nextInt(maxTriangleSize);
		 	
		 	// C coordinates
		 	int Cx = r.nextInt(maxTriangleSize);
		 	int Cy = r.nextInt(maxTriangleSize);
		 	
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
        winnew.add( new RandomTriangles() );
        winnew.setVisible(true);
        numberOffTriangles = DEFAULT_NUMBER_OF_TRIANGLES;
	}
}