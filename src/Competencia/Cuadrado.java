/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Competencia;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Estudiante
 */
public class Cuadrado {
   
    private  Turtle joe;
 
    public Cuadrado() {
     joe =  new Turtle();  
    }
 
    public void dibujar (int x,int y,double a, int t){
        joe.setPos(x,y);
        joe.setH(a);
         
         for (int i = 0; i <4; i++) {
            joe.forward(t);
            joe.right(90);
         }
         
    }
    
}
