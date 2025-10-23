/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_vacondio;


/**
 *
 * @author verifica
 */
public class Porto_vacondio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CapitaneriaDiPorto c1 = new CapitaneriaDiPorto();
        CapitaneriaDiPorto c2 = new CapitaneriaDiPorto();
        CapitaneriaDiPorto c3 = new CapitaneriaDiPorto();
     /*   
        for (int i = 1; i < 6; i++) {
            Internazioanle n(i) =new Internazioanle();
        }
        for (int i = 6; i < 11; i++) {
            Thread i = new Thread (new Nazionale());
        }
*/
        Thread t1 = new Thread (new Internazioanle());
        Thread t2 = new Thread (new Internazioanle());
        Thread t3 = new Thread (new Internazioanle());
        Thread t4 = new Thread (new Internazioanle());
        Thread t5 = new Thread (new Internazioanle());
        
        Thread t6 = new Thread (new Nazionale());
        Thread t7 = new Thread (new Nazionale());
        Thread t8 = new Thread (new Nazionale());
        Thread t9 = new Thread (new Nazionale());
        Thread t10 = new Thread (new Nazionale());
        
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
        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
