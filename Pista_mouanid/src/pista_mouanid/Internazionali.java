/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_mouanid;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica25
 */
public class Internazionali extends Thread {

    private int id;
    private Aereoporto ap;

    public Internazionali(int id, Aereoporto ap) {
        this.id = id;
        this.ap = ap;
    }

    @Override
    public void run() {

        try {
            System.out.println("Volo internazionale " + id + " e' in fila per usare la pista");
            ap.entrataInter();
            System.out.println("Volo internazionale " + id + " sta utilizzando la pista");
            Random rand = new Random();
            Thread.sleep(rand.nextInt(10000) + 10000);
            ap.uscitaInter();
            System.out.println("Volo internazionale " + id + " ha finito di usare la pista");

        } catch (InterruptedException ex) {
            Logger.getLogger(Internazionali.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
