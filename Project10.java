// James Dizikes
// CS 1324 Fall 2019
// Maintained by D. Trytten 4/12/2020
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Project10 extends JPanel
{
	// Change these constants to adjust the size and title of the window.
	private static final int WIDTH = 640;
	private static final int HEIGHT = 300;
	private static final String WINDOW_TITLE = "My Image Title!";
	
	// Do not change the main method.
	public static void main(String[] args)
	{
		JPanel panel = new Project10();
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		JFrame frame = new JFrame(WINDOW_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();
	}
	
	// Add your drawing code to this method.
	public void paintComponent(Graphics g)
	{
		// Do not change these two lines.
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		// Replace the example below with your code.
		 // Draw a rectangle at the bottom half of the window.
        Rectangle2D.Double skin = new Rectangle2D.Double(0, HEIGHT / 2.0, WIDTH, HEIGHT / 2.0);
        g2d.setColor(Color.PINK);
        g2d.fill(skin);
        g2d.draw(skin);
        
        Rectangle2D.Double voidSky = new Rectangle2D.Double(0, HEIGHT / 4.0, WIDTH, HEIGHT / 4.0);
        g2d.setColor(Color.BLACK);
        g2d.fill(voidSky);
        g2d.draw(voidSky);
        
        Polygon scar = new Polygon();
        scar.addPoint(WIDTH, HEIGHT); 
        scar.addPoint(50, 100); 
        scar.addPoint(200, 200); 
        g2d.setColor(Color.MAGENTA);
        g2d.fill(scar);
        g2d.draw(scar);
        
        Ellipse2D.Double eyeWhite = new Ellipse2D.Double(0, HEIGHT / 2.0, WIDTH, HEIGHT / 3.0);
        g2d.setColor(Color.WHITE);
        g2d.fill(eyeWhite);
        
        Ellipse2D.Double pupil = new Ellipse2D.Double(WIDTH / 2 - HEIGHT / 16, HEIGHT / 1 - HEIGHT / 2.5, HEIGHT / 8, HEIGHT / 8);
        g2d.setColor(Color.BLACK);
        g2d.fill(pupil);
        g2d.draw(pupil);
        
        Arc2D.Double eyeLine = new Arc2D.Double(0, HEIGHT / 2.0, WIDTH, HEIGHT / 2.0, 168, 200, Arc2D.OPEN);
	    g2d.setColor(Color.BLACK);
	    g2d.draw(eyeLine);
	    
	    
	    
	}
	
}