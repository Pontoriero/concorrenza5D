/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_golino;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class TorreControllo {
    private final int  maxCapacita = 3;
    private int AereoIntAsp = 0;
    private int AereoIntEntra = 0;
    private int AereoNazAsp = 0;
    private int AereoNazEntra = 0;
    
    public synchronized void entraAereoInt(int nome){
        AereoIntAsp++;
        while(AereoNazEntra > 0 || (AereoIntEntra) > 3){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TorreControllo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        AereoIntAsp--;
        AereoIntEntra ++;
        System.out.println("L'aereo internazionale: "+nome+" e' entrato.");
    }
    
    public synchronized void esceAereoInt(int nome){
        AereoIntEntra--;
        System.out.println("L'aereo internazionale: "+nome+" e' uscito.");
        notifyAll();
    }
    
    public synchronized void entraAereoNaz(int nome){
        AereoNazAsp++;
        while(AereoIntEntra > 0 || (AereoNazEntra) > 3 || AereoIntAsp > 0){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TorreControllo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        AereoNazAsp--;
        AereoNazEntra ++;
        System.out.println("L'aereo nazionale: "+nome+" e' entrato.");
    }
    
    public synchronized void esceAereoNaz(int nome){
        AereoNazEntra--;
        System.out.println("L'aereo nazionale: "+nome+" e' uscito.");
        notifyAll();
    }
}
