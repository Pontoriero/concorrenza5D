/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_migale;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Aereo implements Runnable{
    
    private int id;
    public TorreControllo t;

    public Aereo(int id, TorreControllo t) {
        this.id = id;
        this.t = t;
    }
    
    @Override
    public void run() {
        try {
            if(id >0 && id<6){
                t.entraNaz();
                System.out.println("Un aereo nazionale sta occupando la pista");
                Thread.sleep((int)(Math.random()*11000+10000));
                t.esceNaz();
            }else{
                t.entraInt();
                System.out.println("Un aereo internazionale sta occupando la pista");
                Thread.sleep((int)(Math.random()*11000+10000));
                t.esceInt();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Aereo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
