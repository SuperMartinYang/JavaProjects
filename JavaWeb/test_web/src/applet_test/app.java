package applet_test;

import java.applet.Applet;
import java.awt.Graphics;

public class app extends Applet{
	// display Message in the center of app, or error(when message goes to long, display an error
	public void init(){
		Graphics g = this.getGraphics();
		paint(g);
	}
	public void paint(Graphics g){
		g.drawString("Hello world.", 45, 45);
	}
}
