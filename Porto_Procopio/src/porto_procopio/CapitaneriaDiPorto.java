/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porto_procopio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class CapitaneriaDiPorto {
    private int contaNaviNazionali;
    private int contaAttesaNazionali;
    private int contaNaviInternazionali;
    private int contaAttesaInternazionali;
    private final int max=3;

    public CapitaneriaDiPorto() {
        this.contaNaviNazionali = 0;
        this.contaAttesaNazionali = 0;
        this.contaNaviInternazionali = 0;
        this.contaAttesaInternazionali = 0;
    }
    
    public synchronized void uscitaNaviNazionali(){
        try {
            contaNaviNazionali--;
            for(int i=0; i<5; i++){
                System.out.println("La nave Nazionale: " + i + " e' uscita dalla capitaneria");
            }
            notifyAll();
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
    
    public synchronized void uscitaNaviInternazionali(){
        try {
            contaNaviInternazionali--;
            for(int i=5; i<10; i++){
                System.out.println("La nave Internazionale: " + i + " e' uscita dalla capitaneria");
            }
            System.out.println("La nave Internazionale: " + Thread.currentThread() + " e' uscita dalla capitaneria");
            notifyAll();        
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
    
    public synchronized void entraNaveNazionale(){
        contaAttesaNazionali++;
        try{
            while(contaNaviInternazionali>0 || contaNaviInternazionali==max||contaNaviNazionali==max){
                wait();
                for(int i=0; i<5; i++){
                 System.out.println("La nave Nazionale: " + i + " e' in attesa di attraccare");
                }
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
        contaAttesaNazionali--;
        contaNaviNazionali++;
        for(int i=0; i<5; i++){
                 System.out.println("La nave Nazionale: " + i + " ha attraccato");
        }
    }
    
    public synchronized void entraNaveInternazionale(){
        contaAttesaInternazionali++;
        try{
            while(contaNaviNazionali>0 || contaNaviInternazionali==max||contaNaviNazionali==max){
                wait();
                for(int i=5; i<10; i++){
                    System.out.println("La nave Internazionale: " + i + " e' in attesa di attraccare");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        contaAttesaInternazionali--;
        contaNaviInternazionali++;
        for(int i=5; i<10; i++){
                    System.out.println("La nave Internazionale: " + i + " ha attraccato alla banchina");
        }
    }
    
}
