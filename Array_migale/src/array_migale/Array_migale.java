/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_migale;

/**
 *
 * @author verifica
 */
public class Array_migale {
    public static void main(String[] args) {
        int n = ((int)(Math.random()*11+10));
        int k = ((int)(Math.random()*3+3));
        int array[] = new int[n];
        int divisore[] = new int[k];
        
        
        for(int i = 0; i<n ;i++){
            array[i] = ((int)(Math.random()*101));
            System.out.println(array[i]);
        }
        /*
        System.out.println(k);
        System.out.println(n);
        */
        int divisione = (int)(n/k);
        //System.out.println(divisione);
        /*
        for (int j = 0; j < k; j++) {
            //Thread t = new Thread(new Processo(n,));
            
        }*/
    }
    
    
    
}
