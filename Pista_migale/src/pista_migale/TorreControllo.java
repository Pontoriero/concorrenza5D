/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_migale;

/**
 *
 * @author verifica
 */
public class TorreControllo{
    private int contaInt;
    private int contaNaz;
    private int attesaInt;
    private int attesaNaz;
    private final int n=3;

    public TorreControllo() {
        this.contaInt = contaInt;
        this.contaNaz = contaNaz;
        this.attesaInt = attesaInt;
        this.attesaNaz = attesaNaz;
    }
    
    public synchronized void entraInt() throws InterruptedException{
        attesaInt++;
        
        while(contaInt == n || contaNaz > 0){
            System.out.println("Un aereo internazionale ha richiesto l'accesso");
            wait();
        }
        
        contaInt++;
        attesaInt--;
        
        System.out.println("Un aereo internazionale e' entrato in pista");
    }
    
    public synchronized void entraNaz() throws InterruptedException{
        attesaNaz++;
        
        while(contaNaz == n || contaInt > 0 || attesaInt>0){
            System.out.println("Un aereo nazionale ha richiesto l'accesso");
            wait();
        }
        
        contaNaz++;
        attesaNaz--;
        
        System.out.println("Un aereo nazionale e' entrato in pista");
    }
    
    public synchronized void esceInt(){
        contaInt--;
        
        System.out.println("Un aereo internazionale e' uscito dalla pista");
        notifyAll();
    }
    
    public synchronized void esceNaz(){
        contaNaz--;
        
        System.out.println("Un aereo nazionale e' uscito dalla pista");
        notifyAll();
    }
    
    
}
