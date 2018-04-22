package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
int addition;
	MovingMorph(int x, int y) {
		super(x, y);
		addition = 0;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		addition++;
		width = 10;
		height = 50;
		g.fillRect(getX() + addition, getY(), width, height);
	}
	
}
