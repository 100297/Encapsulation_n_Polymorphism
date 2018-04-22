package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
   protected int x;
   protected int y;
    int width;
    int height;
    Polymorph(int x, int y){
   	 this.setX(x);
   	 this.setY(y);
    
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
