/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_campani;

/**
 *
 * @author verifica
 */
public class LavoroK implements Runnable{
    
    private final int[] array; 
    private final int inizio; 
    private final int fine; 

    public LavoroK(int[] array, int inizio, int fine) {
        this.array = array;
        this.inizio = inizio;
        this.fine = fine;
    }
    
    
    @Override
    public void run(){
        for(int i = inizio; i < fine; i++){
            int v = (int) Math.sqrt(i) + (fine - inizio);
            array[i] = v; 
        }
        
        
        System.out.println(Thread.currentThread().getName() + "Risultato inziale: " + inizio + " Risultato finale: " + fine);
        
    }
    
    
    
}
