/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_martinelli;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author verifica25
 */
public class Array_Martinelli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r=new Random();
        
        // Inserimento lunghezza array
        int n=r.nextInt(11)+10; //da 10 a 20
        
        //creazione array
        int v[]= new int[n];
        

        // Inserimento valori nel vettore e visualizzazione
        System.out.println("visualizzazione array iniziale");
        for (int i = 0; i < n; i++) {
            v[i]=r.nextInt(101); //da 0 a 100
            System.out.println("["+i+"]: "+v[i]);
        }

        //variabili per i calcolatori
        int nThread=r.nextInt(3)+3; //da 3 a 5  
        
        int start=0;
        int lunghezzaCalcoloThread=n/nThread;
        int end=start+lunghezzaCalcoloThread;
        
        for (int i = 0; i < nThread; i++) {
            System.out.println("start: "+start);
            System.out.println("end: "+end);
            Calcolatore c=new Calcolatore(v,start,end);
            c.start();
            
            try {
                c.join();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Array_Martinelli.class.getName()).log(Level.SEVERE, null, ex);
            }
            start=end+1;
            end+=lunghezzaCalcoloThread;
        }
        
        System.out.println("\nNumero thread in calcolazione: "+nThread);
        
        //visualizzazione array modificato
        System.out.println("\nvisualizzazione array modificato");
        for (int i = 0; i < n; i++) {
            System.out.println("["+i+"]: "+v[i]);
        }
    }
    
}
