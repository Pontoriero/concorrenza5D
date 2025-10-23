/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_morellini;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica25
 */
public class Array_morellini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo lun array
        int lArray = (int)(Math.random() * 6) + 13;
        
        ArrayList<Thread> arrayThread = new ArrayList();
        ArrayList<ThreadArray> arraySomme = new ArrayList();
        
        //creo k per i thread
        int k = (int)(Math.random() * 2) + 3;
        
        //creo array con n random da 1 a 99
        int[] array = new int[lArray];
        for (int i = 0; i < lArray; i++){
            array[i] = (int)(Math.random() * 100);
        }
        
        //creo k thread
        for (int i = 0; i < k; i++){
            ThreadArray tA = new ThreadArray(lArray, k, array, i);
            Thread t = new Thread(tA);
            
            arrayThread.add(t);
            arraySomme.add(tA);
            
            t.start();
        }
        
        for (int i = 0; i < k; i++){
            try {
                arrayThread.get(i).join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Array_morellini.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println(arraySomme.get(0).getlArray());
        System.out.println(arraySomme.get(0).getK());
        System.out.println(arraySomme.get(0).getArray()[0]);
        System.out.println(arraySomme.get(0).getnThread());
        
        
    }
    
}
