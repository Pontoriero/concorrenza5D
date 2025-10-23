/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_morellini;

/**
 *
 * @author verifica25
 */
public class CapitaneriaDiPorto {
    
    private final int massimoNavi = 3;
    private int contaInternazionali;
    private int contaNazionali;
    private int codaInternazionali;
    private int codaNazionali;
    private int idNave;

    public CapitaneriaDiPorto() {
        this.contaInternazionali = 0;
        this.contaNazionali = 0;
        this.codaInternazionali = 0;
        this.codaNazionali = 0;
    }
    

    
    public synchronized void entraNazionale(int id) throws InterruptedException{
        
        codaNazionali++;
        
        while (contaInternazionali > 0 || contaInternazionali == massimoNavi || codaInternazionali > 0){
            wait();
        }
        
        System.out.println("La nave nazionale " + id + " e' entrata in banchina");
        
        codaNazionali--;
        contaNazionali++;

    }
    
    public synchronized void entraInternazionale(int id) throws InterruptedException{
        
        codaInternazionali++;
        
        while (contaNazionali > 0 || contaInternazionali == massimoNavi){
            wait();
        }
        
        System.out.println("La nave internazionale " + id + " e' entrata in banchina");
        
        codaInternazionali--;
        contaInternazionali++;

    }
    
    public synchronized void esceInternazionale(int id){
        
        contaInternazionali--;
        
        System.out.println("La nave Internazionale " + id+ " e' uscita dal porto");
        
        notifyAll();
        
    }
    
    public synchronized void esceNazionale(int id){
        
        contaNazionali--;
        
        System.out.println("La nave nazionale " + id + " e' uscita dal porto");
        
        notifyAll();
    }
    
}
