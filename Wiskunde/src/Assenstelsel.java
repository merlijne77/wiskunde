

import javax.swing.JFrame;

import java.awt.*;

@SuppressWarnings("serial")
public class Assenstelsel extends JFrame
{
	private static Graphics gBuf = null;
	private static GraphPaperCanvas canvas = null;
	private static Image vm = null;
	private int x, y;
	private int breedte, hoogte, yAs, xAs, xSteps, ySteps, numbers;
	private Color col;//de kleur van de tekening
	

	//constructor met de parameters x,y (de locatie van de grafiek op het canvas)
	public Assenstelsel( int x, int y )
	{   this.x = x;
		this.y = y;
		breedte = 900;
		hoogte = 900;
		numbers = 20;
		createCanvas();
		drawBounds();
       }
	
	//constructor met de parameters, breedte van de grafiek, hoogte en locatie x,y
	public Assenstelsel(int breedte, int hoogte, int x, int y) {
		
		//TODO: Toch in constructor nummers laten invoeren maar zorgen dat als er meer nummers ingevoerd
		//worden de grafiek groter wordt. En een maximum nummers doen.
		//BUG: Als je nu voor 20 kiest staan er 21 vakjes en kiest hij het midden van 1 vakje waardoor de
		//assen niet op een lijntje staan.
		//Nummers lopen niet genoeg door.
		numbers = 40;
		createCanvas();
		this.x = 40;
		this.y = 40;
		this.breedte = breedte;
		this.hoogte = hoogte;
		drawBounds();
	}
	
	public void drawBounds()
	{
		gBuf.setColor( col);
		gBuf.setColor( Color.LIGHT_GRAY );
		
		for ( int i=0; i<breedte; i+=breedte/numbers )
			gBuf.drawLine( x+i, y+0, x+i, y+hoogte );
            for ( int j=0; j<hoogte; j+=hoogte/numbers )
	    gBuf.drawLine( x+0, y+j, x+hoogte, y+j );
        gBuf.setColor(Color.darkGray);
        drawNumbersAssen(x,y);
		gBuf.setColor( Color.BLACK );
		gBuf.drawRect( x, y, breedte+1, hoogte+1 );
		gBuf.drawLine( x+breedte/2, y+0, x+breedte/2, y+hoogte );
		gBuf.drawLine( x+0, y+hoogte/2, x+breedte, y+hoogte/2 );
		gBuf.setColor(col );
		canvas.repaint();
	}	
	public void setColor( Color c )
	{
		gBuf.setColor(c);
	}
	
	
	/*
	 * de parameters zijn de locatie van de grafiek op
	 * het canvas in x en y
	 */
	public void drawLine( double px, double py, Color color)
	{
		if ( px > 10 || px < -10 || py > 10 || py < -10 )
			return;
		px *= breedte/20;
		py *= hoogte/20;
		px += breedte/2 + 1;
		py = hoogte/2 - py + 1;
		gBuf.setColor(color);
	    gBuf.drawLine( x+(int)px, y+(int)py, x+(int)px, y+(int)py );
        canvas.repaint();
	}
	
	//om de x en y-as te nummeren
	//de parameters x en y zijn de beginlocatie van de grafiek op het canvas
	public void drawNumbersAssen(int x, int y) {
	    yAs = x + breedte/2-8;
	    xAs = y + breedte/2+8;
	    xSteps = x-5;
	    ySteps = y + 5;
	    int helftNummers = (numbers/2);//helft nummers aan iedere kant van de oorsprong
	    System.out.println(helftNummers);//test
	   
		//Nummering van de X-as
		for(Integer j = -helftNummers; j<helftNummers; j++) {
			gBuf.drawString(Integer.toString(j), xSteps, xAs);
			xSteps = xSteps + breedte/numbers;//stapje verder op de as
		}
		//Nummering van de Y-as
		for(Integer i = helftNummers; i >= -helftNummers; i--) {
			if(i<0) {//als de nummers kleiner zijn dan nul verschuift het middelpunt vanwege de - die ervoor komt.
				yAs = x + breedte/2-10;//stapje verder op de as, kleine correctie eraf
			  } 
			if(i!=0) {//0 word niet gedrukt want die staat al in de x as
			gBuf.drawString(Integer.toString(i), yAs, ySteps);
			}
			ySteps= ySteps + breedte/numbers;//w/20 = de breedte van het grit gedeeld door 20
			}
		}
	
	public void createCanvas() {
		if (canvas == null)
		{
		    setTitle("Assenstelsel");
			//setSize(1100,950);
			setSize(500,500);
			setLocation(20,50);

			canvas = new GraphPaperCanvas(null);
			getContentPane().add(canvas);
			setVisible(true);

			vm = canvas.createImage(1100,950);
			gBuf = vm.getGraphics();
			canvas.setVm(vm);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}
}

@SuppressWarnings("serial")
class GraphPaperCanvas extends Canvas
{
	private Image vm;
	
	public GraphPaperCanvas( Image vm )
	{
		this.vm = vm;
		setBackground( Color.white );
	}
	
	public void setVm( Image vm )
	{
		this.vm = vm;
	}
	
	public void paint( Graphics g )
	{
		g.drawImage(vm,0,0,this);
	}
	
	public void update(Graphics g) { paint(g); }	// don't clear screen on repaint

}
