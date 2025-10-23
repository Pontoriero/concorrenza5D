/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_campani;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author verifica
 */
public class Array_campani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Random rnd = new Random(3); 
        
        
        // inzializzazione dell'array di lunghezza N 
        
        int N = 12 + rnd.nextInt(7);
        int[] a = new int[N]; 
        
        // Andando a controllare la K 
        int K = 3 + rnd.nextInt(2);
        
        // stampa n e k 
        System.out.println("N " + N + " " + "K " + K);
        System.out.println(Arrays.toString(a));

        
        // lavorando sulla lavorazione di K 
        
        Thread[] t = new Thread[K]; // lavoro sulla porzione di K 
        int b = N/K;  // fai una base 
        int r = N % K;  // fai un resto 
        int inizio = 0; // fai un'inizio di lavoro 
        
        
        for(int i = 0; i < K; i++){
            int l = 0;
            int fine = 0; 
            
            

            fine = inizio; 
            
            LavoroK lav = new LavoroK(a, inizio, fine);
            t[i] = new Thread(lav); 
            t[i].start();
            
            
            inizio = fine + l;  
            
            
            
        }
        
        try{
            for(int i = 0; i < t.length; i++){
                t[i].join(); 
            } 
        } catch(InterruptedException e){
            System.out.println("Fine ");
        }
        
        
       
        
        
        
        

        
        
    }
    
}
