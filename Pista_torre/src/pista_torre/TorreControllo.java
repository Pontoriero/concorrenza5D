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
public class TorreControllo {

    private final int aMax = 3;
    private int contaNaz;
    private int contaInt;
    private int attesaNaz;
    private int attesaInt;

    public TorreControllo() {
        this.contaNaz = 0;
        this.contaInt = 0;
        this.attesaNaz = 0;
        this.attesaInt = 0;
    }

    public synchronized void entraNaz() throws InterruptedException {

        attesaNaz++;

        while (contaInt > 0 || contaNaz >= aMax || attesaInt > 0) {
            wait();
        }

        attesaNaz--;
        contaNaz++;

    }

    public synchronized void esceNaz() {

        contaNaz--;

        notifyAll();

    }

    public synchronized void entraInt() throws InterruptedException {

        attesaInt++;

        while (contaNaz > 0 || contaInt >= aMax) {
            wait();
        }

        attesaInt--;
        contaInt++;

    }

    public synchronized void esceInt() {

        contaInt--;

        notifyAll();

    }

}
