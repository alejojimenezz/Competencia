package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class POO {
   private  Turtle Donatello;
   
   public POO(){
     this.Donatello =  new Turtle(); 
   }
   
   public void dibujar(){
       /*
      Donatello.forward(100);
      Donatello.curX();
      Donatello.curY();
      //Donatello.clean();
      Donatello.setPos(0, 0);
      */
      rectagulo estructura= new rectagulo(100,100,-20,100);
      estructura.dibujar(Donatello);
   } 
   
   
    public static void main(String[] args) {
       POO e = new POO();
       e.dibujar();
    }
    
}
