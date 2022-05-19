/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author user
 */
public class Factorial {
    private int dato;
    
    public Factorial(){
        this.dato = 0;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public int hacerFactorial(int dato){
        int c = 1; 
        int multi = 0;
        while(dato != 0){
            c = c*dato;
            dato--;
        }
        return c;
    }
}
