
import java.awt.Graphics;

public abstract class GeoShape {

    protected int posX, posY;
    protected double area;

    public GeoShape(){
        posY = 0;
        posX = 0;
        area = this.calcArea();
        
        
    }
    public abstract double calcArea();

    public abstract void drawShape(Graphics g);
    
    public void setPos(int x, int y){
        posY = y;
        posX = x;
    }
}
