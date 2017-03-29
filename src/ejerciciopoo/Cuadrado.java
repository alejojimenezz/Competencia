/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Estudiante
 */
public class Cuadrado {
    private int x;
    private int y;
    private int a;
    private int t;
    private  Turtle joe;
   

    public Cuadrado(int x, int y, int a, int t) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.t = t;
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

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public Turtle getJoe() {
        return joe;
    }

    public void setJoe(Turtle joe) {
        this.joe = joe;
    }
    
    public void dibujar (){
         joe =  new Turtle();
         for (int i = 0; i <4; i++) {
            joe.forward(t);
            joe.right(90);
         }
         
    }
    
}
