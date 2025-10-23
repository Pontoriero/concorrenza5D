/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_mouanid;

/**
 *
 * @author verifica25
 */
public class Aereoporto {

    private int nazInAereoporto;
    private int interInAereoporto;
    private int interInCoda;
    private int capacita = 3;

    public synchronized void entrataNaz() throws InterruptedException {
        while (interInAereoporto != 0 || nazInAereoporto == capacita || interInCoda != 0) {
            wait();
        }
        nazInAereoporto++;

    }

    public synchronized void entrataInter() throws InterruptedException {
        interInCoda++;
        while (nazInAereoporto != 0 || interInAereoporto == capacita) {
            wait();
        }
        interInCoda--;
        interInAereoporto++;
    }

    public synchronized void uscitaNaz() {
        nazInAereoporto--;
        notifyAll();
    }

    public synchronized void uscitaInter() {
        interInAereoporto--;
        notifyAll();
    }
}

