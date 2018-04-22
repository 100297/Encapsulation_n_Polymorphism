package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    	ArrayList<Polymorph> polys;
    Polymorph movePoly;
    Polymorph CircMorph;
    Polymorph blue;
    Polymorph mouse;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	polys = new ArrayList<Polymorph>();
   	movePoly = new MovingMorph(0,100);
  	 blue = new BluePolymorph(200,200);
  	 CircMorph = new CircleMorph(90,90);
   	mouse = new MouseMorph(400,400);
  	 polys.add(movePoly);
   	polys.add(blue);
   	polys.add(CircMorph);
   	polys.add(mouse);
    	window = new JFrame("IT'S MORPHIN' TIME!");
   	window.addMouseMotionListener((MouseMotionListener) mouse); 
    	window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
   	 System.out.println(polys.size());
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (Polymorph polymorph : polys) {
   		 if(polymorph != null) {
   			polymorph.draw(g);
   		   		 } else {
   			 System.out.println("null");
   		 }
		
	}

    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for (Polymorph polymorph : polys) {
		if(polymorph != null ) {
			polymorph.update();
		}
   		 
	}

    }
}
