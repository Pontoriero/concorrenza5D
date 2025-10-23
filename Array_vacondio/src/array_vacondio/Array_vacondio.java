/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_vacondio;



/**
 *
 * @author verifica
 */
public class Array_vacondio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sommavalore s1 = new Sommavalore ( (int) ((Math.random()*10)+1),(int) (Math.random()*10));
/*
        for (int i = 0; i < ((Math.random()*4)+3); i++) {
            
            Thread i = new Thread(s1);
        }
*/
        Thread t1 = new Thread(s1);
        
        t1.start();
        
        try {
            t1.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
