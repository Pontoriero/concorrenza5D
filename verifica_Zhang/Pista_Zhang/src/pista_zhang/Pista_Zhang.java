/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_zhang;

/**
 *
 * @author verifica
 */
public class Pista_Zhang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pista p=new Pista();

        new Thread(new Nazionali(1,p)).start();
        new Thread(new Nazionali(2,p)).start();
        new Thread(new Nazionali(3,p)).start();
        new Thread(new Nazionali(4,p)).start();
        new Thread(new Nazionali(5,p)).start();
        new Thread(new Internazionali(6,p)).start();
        new Thread(new Internazionali(7,p)).start();
        new Thread(new Internazionali(8,p)).start();
        new Thread(new Internazionali(9,p)).start();
        new Thread(new Internazionali(10,p)).start();

    }
    
}
