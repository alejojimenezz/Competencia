
package Competencia;

import ch.aplu.turtle.Turtle;
/**
 *
 * @author Estudiante
 */
public class Circulo extends Turtle {
    
    private double radio;
    private double posX;
    private double posY;
    private double delta;

    public Circulo(double radio, double posX, double posY) {
        this.radio = radio;
        this.posX = posX;
        this.posY = posY;
        this.delta = Math.asin(1/radio);
        this.setPos(posX, posY);
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }
    
    public void dibujar25() {
        this.speed(DEFAULT_SPEED*1000);
        this.setH(0);
        this.penUp();
        this.forward(this.radio);
        this.penDown();
        this.left(90);
        for (int i = 0; i < 360; i+= 2.3) {
            this.left(2.3);
            this.forward(1);
        }
        
    }
    
    public void dibujar15() {
        this.speed(DEFAULT_SPEED*1000);
        this.penUp();
        this.setH(0);
        this.forward(this.radio);
        this.left(90);
        this.penDown();
        for (int i = 0; i < 360; i+= 4.6) {
            this.left(4.6);
            this.forward(1);
        }
        
    }
}
