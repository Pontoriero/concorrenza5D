/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_migale;

/**
 *
 * @author verifica
 */
public class Pista_migale {
    public static void main(String[] args) {
        //(int)(Math.random()*11+10) da 10 a 20
        TorreControllo torre = new TorreControllo();
        
        for(int i=1; i<11;i++){
            Thread n = new Thread(new Aereo(i,torre));
            n.start();
        }
    }
    
}
