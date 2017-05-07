
import java.awt.Graphics;

import javax.swing.JApplet;


public class HelloWorld extends JApplet { 
private static final long serialVersionUID = 1L; 
public void paint(Graphics g){ 
g.drawString("15130765",10,10); 
g.drawString("15130151",10,20); 
g.drawString("15130153",10,30); 
g.drawString("15130882",10,40); 

} 
public HelloWorld() { 
   
} 

	public static void main(String[] args) {
	HelloWorld s = new HelloWorld();
		s.start();
    }

}