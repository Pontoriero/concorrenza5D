/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_torre;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class AereoInt implements Runnable{
    
    TorreControllo t;
    String id;
    Random r = new Random();

    public AereoInt(TorreControllo t, String id) {
        this.t = t;
        this.id = id;
    }
    
    @Override
    public void run(){
       
        try {
            System.out.println("L'Aereo " + this.id +" richiede l'accesso ");
            t.entraInt();
            System.out.println("L'Aereo " +  this.id + " atterra");
            System.out.println("L'Aereo " + this.id + " e in pista!");
            Thread.sleep(r.nextInt(20000-10000+1)+10000);
            t.esceInt();            
            System.out.println("L'Aereo " + this.id + " libera la pista");
        } catch (InterruptedException ex) {
            Logger.getLogger(AereoNaz.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        
    }
    
}
