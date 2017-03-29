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
public class Main {
    
    public static void main(String[] args) {
        double r1 = 25;
        int l = 40;
        double r2 = 12.5;
        Circulo [] c1 = new Circulo [8];
        for (int i = 0; i < 6; i++) {
            c1[i]= new Circulo (25,0,-60+(20*i));
            c1[i].dibujar25();
        }
        Cuadrado c = new Cuadrado ();
        c.dibujar(0, 0, 0, l);
        Elipse e = new Elipse ();
    }
    
}
