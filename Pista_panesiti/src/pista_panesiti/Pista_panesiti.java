/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_panesiti;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Pista_panesiti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TorreControllo t = new TorreControllo();
        
        
        Thread t1 = new Thread(new Aereo(1,t));
        Thread t2 = new Thread(new Aereo(2,t));
        Thread t3 = new Thread(new Aereo(3,t));
        Thread t4 = new Thread(new Aereo(4,t));
        Thread t5 = new Thread(new Aereo(5,t));
        Thread t6 = new Thread(new Aereo(6,t));
        Thread t7 = new Thread(new Aereo(7,t));
        Thread t8 = new Thread(new Aereo(8,t));
        Thread t9 = new Thread(new Aereo(9,t));
        Thread t10 = new Thread(new Aereo(10,t));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        
        /*for(int i=2; i<11; i++){
            new Thread(new Aereo(i,t));
        }
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pista_panesiti.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Pista vuota");*/
    }
    
}
