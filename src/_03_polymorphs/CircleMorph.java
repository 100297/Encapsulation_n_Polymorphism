package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	int ctr = 0;
	CircleMorph(int x, int y) {
		super(x, y);
		
	}

	@Override
	public void draw(Graphics g) {
		x +=Math.sin(ctr) * 25;
		y +=Math.cos(ctr) * 25;
		g.setColor(Color.yellow);
		width = 50;
		height = 50;
		ctr ++;
	
		
		g.fillRect(getX(), getY(), width, height);
	}
	
}
