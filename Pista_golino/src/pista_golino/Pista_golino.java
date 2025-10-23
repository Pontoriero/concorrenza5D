/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_golino;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Pista_golino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TorreControllo t = new TorreControllo();
        AereoNazionale n1 = new AereoNazionale(1, t);
        AereoNazionale n2 = new AereoNazionale(2, t);
        AereoNazionale n3 = new AereoNazionale(3, t);
        AereoNazionale n4 = new AereoNazionale(4, t);
        AereoNazionale n5 = new AereoNazionale(5, t);
        AereoInternazionale n6 = new AereoInternazionale(6, t);
        AereoInternazionale n7 = new AereoInternazionale(7, t);
        AereoInternazionale n8 = new AereoInternazionale(8, t);
        AereoInternazionale n9 = new AereoInternazionale(9, t);
        AereoInternazionale n10 = new AereoInternazionale(10, t);
        
        n1.start();
        n2.start();
        n3.start();
        n4.start();
        n5.start();
        n6.start();
        n7.start();
        n8.start();
        n9.start();
        n10.start();
        
        try {
            n1.join();
            n2.join();
            n3.join();
            n4.join();
            n5.join();
            n6.join();
            n7.join();
            n8.join();
            n9.join();
            n10.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pista_golino.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("FINE");
        
    }

}
