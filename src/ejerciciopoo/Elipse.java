package ejerciciopoo;

import ch.aplu.turtle.Turtle;

public class Elipse {
    
    private int x,y,a;
    private Turtle joe;

    public Elipse(int x, int y, int a) {
        this.x = x;
        this.y = y;
        this.a=a;
        joe= new Turtle();
        joe.setH(a);
    }

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
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void dibujar(){
        for(int j=0;j<2;j++){
            for(int z=0;z<15;z++){
                joe.right(3);
                joe.forward(1);
            }
            for(int i=0;i<30;i++){
                joe.right(3);
                joe.forward(3);
            } 
            for(int z=0;z<15;z++){
                joe.right(3);
                joe.forward(1);
            }
            joe.setH(a+180);
        }
    }
    
    
}
