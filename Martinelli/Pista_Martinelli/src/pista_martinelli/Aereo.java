/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_martinelli;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica25
 */
public class Aereo implements Runnable{
    private int ID;
    private TorreControllo t; 
    private boolean tipo; //true= internazionale false=nazionale

    public Aereo(int ID, TorreControllo t, boolean tipo) {
        this.ID = ID;
        this.t = t;
        this.tipo = tipo;
    }
    
    

    @Override
    public void run() {
        Random r=new Random();
        if(tipo){ //internazionale
            System.out.println("Aereo ID: "+ ID+" internazionale Richiesta di accesso alla pista");
            
            t.entraInternazionale();
            System.out.println("Aereo ID: "+ ID+ " internazionale atterrato");
            
            try {
                System.out.println("Aereo ID: "+ ID+ " internazionale in pista");
                Thread.sleep(r.nextInt(11000)+10000); //tempo che rimane in pista (10-20s)
                
                t.esceInternazionale();
                System.out.println("Aereo ID: "+ ID+" internazionale esce dalla pista");
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Aereo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Aereo ID: "+ ID+" nazionale Richiesta di accesso alla pista");
            
            t.entraNazionale();
            System.out.println("Aereo ID: "+ ID+ " nazionale atterrato");
            
            try {
                System.out.println("Aereo ID: "+ ID+ " nazionale in pista");
                Thread.sleep(r.nextInt(11)+10); //tempo che rimane in pista (10-20s)
                
                t.esceNazionale();
                System.out.println("Aereo ID: "+ ID+" nazionale esce dalla pista");
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Aereo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
