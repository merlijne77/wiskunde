

import java.awt.Color;

@SuppressWarnings("unused")
public class GraphingParabolas
{
	public static void main( String[] args )
	{
		double y;
		double a, h, k;

//		GraphPaper gp1 = new GraphPaper(10,10);
//		for ( double x = -10; x<=10; x+=0.01 )
//		{
//			a = 1;
//			h = 0; k = 0;
//			y = a*Math.pow(x-h,2) + k;
//			gp1.setTitle("PARABOLEN");
//			
//			gp1.drawPoint(x,y);
//		}

		//Huiswerk les 8 opdracht 1
		Assenstelsel gp2 = new Assenstelsel(320,10);
		for ( double x = -10; x<=10; x+=0.01 )//
		{
			a = 2;
			h = -0.25; //k = 5;
			y= h * x + a;
//			y = a*Math.pow(x,2) + k;
			gp2.drawPoint(x,y);
		}

		//Huiswerk les 8 opdracht 2
		Assenstelsel gp3 = new Assenstelsel(630,10);
		for ( double x = -10; x<=10; x+=0.005 )
		{
			a = 2;
			//h = -1; //k = -3;
			y = 2*Math.pow(x,a) + 1;
			gp3.drawPoint(x,y);
		   
		}

//		GraphPaper gp4 = new GraphPaper(10,320);
//		for ( double x = -10; x<=10; x+=0.01 )
//		{
//			a = 2;
//			h = 0; k = 0;
//			y = a*Math.pow(x,2) + k;
//			gp4.drawPoint(x,y);
//		}
//
//		GraphPaper gp5 = new GraphPaper(320,320);
//		for ( double x = -10; x<=10; x+=0.01 )
//		{
//			a = 2;
//			h = -3; k = 4;
//			y = a*Math.pow(x-h,2) + k;
//			gp5.drawPoint(x,y);
//		}
//
//		GraphPaper gp6 = new GraphPaper(630,320);
//		for ( double x = -10; x<=10; x+=0.01 )
//		{
//			a = -0.5;
//			h = -5; k = 5;
//			y = a*Math.pow(x-h,2) + k;
//			gp6.drawPoint(x,y);
//		}

	}
}
