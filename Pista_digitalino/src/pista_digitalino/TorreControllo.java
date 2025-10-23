/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_digitalino;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica25
 */
public class TorreControllo extends Thread {

    private int occupate = 0;
    private final int torre;
    private int attendiInt = 0;
    private int attendiNaz = 0;

    private int aereoAttuale = 0;
    private int contaInte = 0;
    private static final int MAX_INT = 5;

    public TorreControllo(int torre) {
        this.torre = torre;
    }

    public synchronized void entraInternazionale() {
        attendiInt++;
        while(occupate == torre || aereoAttuale == 2 || (aereoAttuale == 0 && attendiNaz > 0 && contaInte < MAX_INT)){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TorreControllo.class.getName()).log(Level.SEVERE, null, ex);
            }
            attendiNaz--;
            occupate++;
            aereoAttuale = 1;
            contaInte = 0;
            System.out.println(Thread.currentThread().getName() + "è atterrato, porti occupati: " + occupate);
        }
    }

    public synchronized void entraNazionale() {
        System.out.println("Aereo nazionale sta entrando");
    }

    public synchronized void esciInternazionale() {
        System.out.println("Aereo internazionale sta uscendo");
    }

    public synchronized void esciNazionale() {
        System.out.println("Aereo nazionale sta uscendo");
    }
}
