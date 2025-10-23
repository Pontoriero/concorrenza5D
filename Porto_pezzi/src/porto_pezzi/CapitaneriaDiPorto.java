/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_pezzi;

/**
 *
 * @author verifica
 */
public class CapitaneriaDiPorto {

    private int contaNaviInter = 0;
    private int contaNaviNaz = 0;
    private int attesaNaviNaz = 0;
    private int attesaNaviInter = 0;
    
    public synchronized void uscitaNaviNaz() {

        contaNaviNaz--;
        //System.out.println(Thread.currentThread().getName() + " Nave nazionale uscita dalla banchina!");
        notifyAll();

    }

    public synchronized void uscitaNaviInter() {

        contaNaviInter--;
        //System.out.println(Thread.currentThread().getName() + " Nave internazionale uscita dalla banchina!");
        notifyAll();

    }

    public synchronized void entrataNaviNaz() throws InterruptedException {
        attesaNaviNaz++;
        while (contaNaviNaz == 3 || attesaNaviNaz > 0 || contaNaviInter > 0) {
            wait();
        }
        contaNaviNaz++;
        //System.out.println(Thread.currentThread().getName() + " Nave nazionale entrata nella banchina!");
        attesaNaviNaz--;
    }

    public synchronized void entrataNaviInter() throws InterruptedException {
        while (contaNaviInter == 3 || contaNaviNaz > 0) {
            wait();
        }
        contaNaviInter++;
        //System.out.println(Thread.currentThread().getName() + " Nave internazionale entrata nella banchina!");
        attesaNaviInter--;
    }
}
