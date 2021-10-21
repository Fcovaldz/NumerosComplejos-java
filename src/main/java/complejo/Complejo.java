/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejo;

/**
 *
 * @author iampa
 */
public class Complejo {
    
    private int imaginario, real;
    
    public Complejo(){
    this.imaginario = 0;
    this.real = 0;
}
    public Complejo(int i, int r){
        this.imaginario = i;
        this.real = r;
    }

    public int getImaginario() {
        return imaginario;
    }

    public void setImaginario(int r) {
        this.imaginario = r;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int r) {
        this.real = r;
    }
    
}
