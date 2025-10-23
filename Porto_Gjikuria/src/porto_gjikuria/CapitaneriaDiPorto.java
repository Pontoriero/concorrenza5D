/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_gjikuria;

/**
 *
 * @author verifica
 */
public class CapitaneriaDiPorto {
    
    private int contNazionali;
    private int contInternazionali;
    private int contAttesaNazionali;
    private int contAttesaInternazionali;
    private final int ban=3;

    public CapitaneriaDiPorto() {
        this.contNazionali = 0;
        this.contInternazionali = 0;
        this.contAttesaNazionali = 0;
        this.contAttesaInternazionali = 0;
    }
    
    
    public synchronized void uscitaInternazionali(){
    
        contInternazionali--;
        System.out.println(Thread.currentThread().getName() + "nave internazionale libera la banchina");
        notifyAll();
}
    
    
    public synchronized void uscitaNazionali(){
    
        contNazionali--;
        System.out.println(Thread.currentThread().getName() + "nave nazionale libera la banchina");
        notifyAll();
}
    
    public synchronized void entrataInternazionali() throws InterruptedException{
        
        contAttesaInternazionali++;
        System.out.println("nave internazionale richiede accesso");
        
        while(contNazionali>0 || contInternazionali==ban){
            wait();
        }
        
        contAttesaInternazionali--;
        contInternazionali++;
        System.out.println("nave internazionale sta atraccando");
        System.out.println("nave internazionale occupa la banchina");
    }
    
    
    public synchronized void entrataNazionali() throws InterruptedException{
        
        contAttesaNazionali++;
        System.out.println("nave nazionale richiede accesso");
        
        while(contNazionali==ban || contInternazionali>0 || contAttesaInternazionali>0){
            wait();
        }
        
        contAttesaNazionali--;
        contNazionali++;
        System.out.println("nave nazionale sta attraccando");
        System.out.println("nave nazionale occupa la banchina");
    }
    
    
    
}