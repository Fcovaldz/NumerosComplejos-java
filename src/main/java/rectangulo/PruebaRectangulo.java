
package rectangulo;

import javax.swing.JOptionPane;

public class PruebaRectangulo {
    public static void main(String[] args){
        Rectangulo r1;
        float lado1, lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado: "));
         lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado: "));
         
         if(lado1 == lado2){
             r1 = new Rectangulo(lado1);
         } else {
             r1 = new Rectangulo(lado1, lado2);
         }
         System.out.println("Perimetro: " + r1.getPerimetro());
         System.out.println("Area: " + r1.getArea());
    }
    
}
