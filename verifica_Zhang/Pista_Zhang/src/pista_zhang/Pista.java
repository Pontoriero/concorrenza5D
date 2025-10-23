/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_zhang;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Pista {
    private int contNazionali;
    private int contInternazionali;
    private int AttesaInternazionali;

    public Pista() {
        int contNazionali=0;
        int contInternazionali=0;
        int AttesaInternazionali=0;
    }
    
    
    public synchronized void EntraNazionali(){
        while(contNazionali>=3 || contInternazionali>0 || AttesaInternazionali>0){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Pista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        contNazionali++;
        System.out.println("è entrato il Nazionali"+Thread.currentThread().getName());
        notifyAll();
            
    }
    public synchronized void EntraInternazionali(){
        AttesaInternazionali++;
        System.out.println("è entrato in attesa "+Thread.currentThread().getName());
        while(contNazionali>0 || contInternazionali>=3){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Pista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        AttesaInternazionali--;
        contInternazionali++;
        System.out.println("è entrato il Internazionali"+Thread.currentThread().getName());
        notifyAll();
            
    }
    
   public synchronized void EsceNazionali(){
        contNazionali--;
        System.out.println("è uscito il Nazionali "+Thread.currentThread().getName());
        notifyAll();
         
}
   public synchronized void EsceInternazionali(){
        contInternazionali--;
        System.out.println("è uscito il Internazionali "+Thread.currentThread().getName());
        notifyAll();
}
}
