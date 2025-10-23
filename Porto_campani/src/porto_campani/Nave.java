/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_campani;

import java.util.Random;

/**
 *
 * @author verifica
 */
public class Nave implements Runnable{
    
    // INIZIALIZZAZIONI 
    
    private final String nome; 
    private final CapitaneriaDiPorto cap; 
    private final TipoNave tipo; 
    private final Random rnd = new Random(); 

    public Nave(String nome, CapitaneriaDiPorto cap, TipoNave tipo) {
        this.nome = nome;
        this.cap = cap;
        this.tipo = tipo;
    }
    
    public String getNome(){
        return nome;
    }
    
    
    @Override
    public void run(){
        
        try{
            System.out.println(Thread.currentThread().getName() + tipo + " Sta richiedendo di entrare");
            
            // controllo in entrata 
            if(tipo == TipoNave.INTERNAZIONALE){
                cap.entraInternazionale();
            } else {
                cap.entraNazionale();
            }
            
            // implementazione del random 
            int t = 10 + rnd.nextInt(11); // --> da 10 a 20 
            System.out.println(Thread.currentThread().getName() + tipo + "Sta aspettando per " + t + " secondi" );
            Thread.sleep((long)t * 1000);
            
            
            // controllo in uscita 
            if(tipo == TipoNave.INTERNAZIONALE){
                cap.esciInternazionale();
            } else {
                cap.esciNazionale();
            }
            
        } catch(InterruptedException e){
            System.out.println("Fine Anticipata");
        }
        
        
        
    }
    
    
    
    
}
