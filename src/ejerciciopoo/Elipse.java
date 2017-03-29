package ejerciciopoo;

import ch.aplu.turtle.Turtle;

public class Elipse {

    private Turtle joe;

    public Elipse(Turtle joe) {
        this.joe = joe;
    }

    public void dibujarE(double x,double y,double a){
        joe.setPos(x,y);
        joe.setH(a);
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
    
    public void dibujarA(double x,double y,double a){
        joe.setPos(x,y);
        joe.setH(a);
        for(int z=0;z<15;z++){
                joe.right(3);
                joe.forward(1);
            }
            for(int i=0;i<15;i++){
                joe.right(3);
                joe.forward(3);
            } 
    }
    
    
}
