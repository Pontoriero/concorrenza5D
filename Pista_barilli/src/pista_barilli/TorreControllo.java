/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_barilli;

/**
 *
 * @author verifica
 */
public class TorreControllo {

    private int aereiint;
    private int aerein;
    private int contaereiint;
    private int contaerein;
    private final int n = 3;

    public TorreControllo() {
        this.aereiint = 0;
        this.aerein = 0;
        this.contaereiint = 0;
        this.contaerein = 0;
    }

    public synchronized void entra() {
        System.out.println(Thread.currentThread().getId() + " richiede di entrare in pista");
        if (Thread.currentThread().getId() > 5) {
            contaereiint++;
        } else {
            contaerein++;
        }
    }

    public synchronized void entraInternazionale() throws InterruptedException {
        while (aereiint >= n || aerein>0) {
            wait();
        }
        contaereiint--;
        aereiint++;
        System.out.println(Thread.currentThread().getId() + " Approvato l'accesso alla pista, entra pure pilota");
    }

    public synchronized void entranazionale() throws InterruptedException {
        while (aereiint > 0 || contaerein>=n) {
            wait();
        }
        contaerein--;
        aerein++;
        System.out.println(Thread.currentThread().getId() + " Approvato l'accesso alla pista, entra pure");
    }
    public synchronized void uscitaInternazionale() throws InterruptedException {
        aereiint--;
        System.out.println(Thread.currentThread().getId() + " esce dalla pista, preparati sarà un lungo viaggio");
        notifyAll();
    }

    public synchronized void uscitanazionale() throws InterruptedException {
        aerein--;
        System.out.println(Thread.currentThread().getId() + " esce dalla pista, buon viaggio");
         notifyAll();
    }


}
