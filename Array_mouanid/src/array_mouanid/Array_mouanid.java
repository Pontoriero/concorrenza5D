/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_mouanid;

import java.util.Random;

/**
 *
 * @author verifica25
 */
public class Array_mouanid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int lunghezza = rand.nextInt(10)+10;
        int arr[] = new int[lunghezza];
        int arrFinale[] = new int[lunghezza];
        int k = rand.nextInt(2)+3;
        
        for(int i=0;i<lunghezza;i++){
            arr[i] = rand.nextInt(100);
            System.out.println("Valore inizale al posto " + i + ": " + arr[i]);
        }
        
        for(int i=0;i<k;i++){ 
            int start = (lunghezza/k*i); //al primo giro parte a zero perche i = 0, ai giri sucessivi partira sempre dalla frazione designata
            int end = (lunghezza/k*(i+1)-1); //finisce sempre appena prima dello start di quello dopo 
            new Thread(new Radice(arr,arrFinale,start,end)).start();
            
        }
         
        
    
        
    }
    
}
