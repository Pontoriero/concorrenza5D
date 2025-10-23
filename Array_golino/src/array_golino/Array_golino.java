/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_golino;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Array_golino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> v1 = new ArrayList();
        ArrayList<Integer> r = new ArrayList();
        int n = (int)(Math.random()*11+10);
        
        for(int i=0; i<n; i++){
            v1.add((int)(Math.random()*100+1));
            r.add(0);
        }
        
        System.out.println("Array iniziale v1: ");
        for(int i=0; i<n; i++){
            System.out.println("Numero in posizione "+i+": "+v1.get(i));
        }
        
        int k = (int)(Math.random()*3+3);
        System.out.println("Valore di k: "+k);  //3
        int div = (int)(v1.size()/k); //10/3 = 3
        
        int pos = 0;
        for(int i=0; i<k; i++){
            Thread t = new Thread(new ThreadCalcolo(v1,r,pos,div));
            pos = pos+div;
            div = div+div;
            t.start();
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Array_golino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("Vettore creato: ");
        for(int i=0; i<n; i++){
            System.out.println("Valore "+i+": "+r.get(i));
        }
        
    }
    
}
