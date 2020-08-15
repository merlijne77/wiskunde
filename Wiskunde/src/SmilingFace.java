

import java.awt.*;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SmilingFace extends Canvas{

public void paint (Graphics g){
	
	g.setColor(Color.yellow);
    g.fillOval(75,40,200,200);
    
    g.setColor(Color.blue);
    g.fillOval(115, 100, 40, 40);
    g.fillOval(185, 100, 40, 40);
    
    g.setColor(Color.red);
    g.drawArc(120,100,100,100,200,140);
    }
   

public static void main( String[] args )
{
    JFrame win = new JFrame("SmilingFace");
    win.setSize(350,300);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SmilingFace canvas = new SmilingFace();
    win.add( canvas );
    win.setVisible(true);
}
}

