/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_torre;

/**
 *
 * @author verifica
 */
public class Pista_torre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TorreControllo t = new TorreControllo();
        
        
        for (int i = 0; i < 5; i++) {
            new Thread(new AereoNaz(t,"ID"+ (i+1))).start();
            new Thread(new AereoInt(t,"ID"+ (i+6))).start();           
        }
    }
    
}
