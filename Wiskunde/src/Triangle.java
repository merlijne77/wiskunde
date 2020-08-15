

import java.awt.*;

import javax.swing.JFrame;

import java.awt.Polygon;

@SuppressWarnings("serial")
public class Triangle extends Canvas {
	
	public void paint( Graphics g )
    {
		
		 	Polygon triangle = new Polygon();
	        triangle.addPoint(250, 100);
	        triangle.addPoint(125, 200);
	        triangle.addPoint(250, 300);
	        
	        Color myPurple = new Color(148,9,120);
	        g.setColor(myPurple);
	        g.fillPolygon(triangle); 
    }

	 public static void main(String[] args)
	    {
	        JFrame winnew = new JFrame("Triangle");
	        winnew.setSize(1024,768);
	        winnew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        winnew.add( new Triangle() );
	        winnew.setVisible(true);
}
}