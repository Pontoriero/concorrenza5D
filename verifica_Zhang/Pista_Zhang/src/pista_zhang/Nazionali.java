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
public class Nazionali implements Runnable{
    private int id;
    private Pista p;

    public Nazionali(int id, Pista p) {
        this.id = id;
        this.p = p;
    }

    @Override
    public void run() {
        try {
            p.EntraNazionali();
            Thread.sleep((long) (Math.random()*20000+10000));
            p.EsceNazionali();
        } catch (InterruptedException ex) {
            Logger.getLogger(Nazionali.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
