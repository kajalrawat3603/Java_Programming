package unit04;

import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;


import javax.swing.JFrame;

public class P15_Graphics_GUI extends Canvas {

	public static void main(String[] args) {
		P15_Graphics_GUI obj = new P15_Graphics_GUI();
		
		JFrame f =new JFrame();
		f.add(obj);
		f.setSize(500,280);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void paint(Graphics grap) {
		grap.drawOval(120,60,30,40);
		grap.drawOval(290,60,30,30);
		grap.drawLine(FRAMEBITS, ERROR, ALLBITS, ABORT);
		setForeground(Color.RED);
		grap.fillOval(160, 60, 30, 30);
		grap.fillOval(250, 60, 30, 30);
		grap.drawArc(200, 60, 50, 50, 240, 60);
		grap.drawArc(195, 100, 50, 50, 55, 60);
		grap.drawRect(150, 40, 140, 90);

	}
}
