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
public class CapitaneriaDiPorto{
    private int ContInternazionali;
    private int ContNazionali;
    private int ContAttesaInternazionali;
    private int ContAttesaNazionali;

    public CapitaneriaDiPorto() {
        this.ContInternazionali = 0;
        this.ContNazionali = 0;
        this.ContAttesaInternazionali = 0;
        this.ContAttesaNazionali = 0;
    }
    
    public synchronized void  UscitaInternazionali(){
        this.ContInternazionali--;
        
        for (int i = 1; i < 6; i++) {
            System.out.println(" la nave internazionale con id " + i + " è uscita ");          
        }
        
        notifyAll();
    } 
    
    public synchronized void  UscitaNazionali(){
        this.ContInternazionali--;
        
        for (int i = 6; i < 11; i++) {
            System.out.println(" la nave nazionale con id " + i + " è uscita ");          
        }
        
        notifyAll();
    }
    
    public synchronized void EntrataInternazionali() throws InterruptedException{
        this.ContAttesaInternazionali++;
        while(this.ContNazionali>0 || this.ContInternazionali==3){
            wait();
        }
        for (int i = 1; i < 6; i++) {
            System.out.println(" la nave internazionale con id "+ i +" è entrata ");
        }
        this.ContAttesaInternazionali--;
        this.ContInternazionali++;
    }
    
    public synchronized void EntrataNazionali() throws InterruptedException{
        this.ContAttesaNazionali++;
        while(this.ContInternazionali>0 || this.ContNazionali==3){
            wait();
        }
        for (int i = 1; i < 6; i++) {
            System.out.println(" la nave Nazionale con id "+ i +" è entrata ");
        }
        this.ContInternazionali++;
        this.ContAttesaNazionali--;
    }
    
    
    
}
