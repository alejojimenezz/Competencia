package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class POO {
   private  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void dibujar(){
      joe.forward(20);
   } 
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Turtle joe= new Turtle(); 
       Elipse e= new Elipse(100,100,0,joe);
       e.dibujarA();
       
    }
    
}
