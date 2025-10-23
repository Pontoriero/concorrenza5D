/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_barilli;

import java.util.ArrayList;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Pista_barilli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TorreControllo x=new TorreControllo();
        Thread [] t=new Thread[10];
        Aereo [] Aerei=new Aereo[10];
        for(int i=0; i<10;i++){
            Aerei[i] = new Aereo(i, x); 
             t[i]=new Thread(Aerei[i]);
             t[i].start();
           
        }
       

        
    }
    
}
