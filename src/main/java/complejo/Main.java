/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejo;

import java.util.Scanner;

/**
 *
 * @author iampa
 */
public class Main {
    
    public static void main(String[] args){
        int i,r;
        String signo ="";
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el valor real del primer numero complejo");
        r = leer.nextInt();
        
        System.out.println("Digite el valor imaginario del primer numero complejo");
        i = leer.nextInt();
        
        signo = i >= 0? "+" : "";
        
        System.out.println("Numeros ingrasados: " + r + "" + signo + ""+ i + "i");
        
        Complejo a = new Complejo(i, r);
        
        System.out.println("Digite valor real del segundo numero complejo");
        r = leer.nextInt();
        
        System.out.println("Ingresa el valor imaginario del segundo numero complejo");
        i = leer.nextInt();
        
        signo = i >= 0? "+" : "";
        
        System.out.println("Numeros ingresados " + r + "" + signo + "" + i + "i");
        
        Complejo b = new Complejo(r, i);
        
        int sr = a.getReal()+ b.getReal();
        int si = a.getImaginario()+ b.getImaginario();
        
        signo = si >= 0? "+" : "";
        
        System.out.print("Suma = " + sr + "" + signo + "" + si + "i\t");
        
        int rr = a.getReal()- b.getReal();
        int ri = a.getImaginario()- b.getImaginario();
        
        signo = ri >= 0? "+" : "";
        
        System.out.println("Resta = " + rr + "" + signo + "" + ri + "i");
    }
}
