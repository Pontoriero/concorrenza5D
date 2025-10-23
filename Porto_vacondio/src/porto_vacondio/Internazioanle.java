/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_vacondio;


/**
 *
 * @author verifica
 */
public class Internazioanle implements Runnable{
    CapitaneriaDiPorto cap;

    public Internazioanle() {
        this.cap = cap;
    }
    
    public CapitaneriaDiPorto getCap() {
        return cap;
    }

    public void setCap(CapitaneriaDiPorto cap) {
        this.cap = cap;
    }
    
    @Override
    public void run(){
        try {
            System.out.println(" la nave internazionale è entrata");
            Thread.sleep((long) (Math.random()*20)+10);
            System.out.println("la nave internazionale è uscita dalla banchina");
            
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
