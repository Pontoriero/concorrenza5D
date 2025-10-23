/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_guidotti;

import java.util.Random;

/**
 *
 * @author verifica
 */
public class Array_guidotti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Implemento il metodo random che mi crea elementi randomici
        Random rand = new Random();
        
        int arr[] = new int[rand.nextInt(7)+12];
        System.out.println("Grandezza dell'Array: "+arr.length);
        
        for(int i=0; i<arr.length; i++){
            arr[i] = rand.nextInt(99)+1;
            System.out.println("Valore dell'array al punto "+ i+ ": "+arr[i]);
        }
        
        int nThread = rand.nextInt(2)+3;
        System.out.println(nThread);
        
        for(int i=0; i<nThread;i++){
            new Thread(new MioThread(arr,nThread,i)).start();
            
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println("Valore al punto i: "+ arr[i]);
        }
        
        
        
    }
    
}
