/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_popa;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Internazionale implements Runnable {
    CapitaneriaDiPorto cp;
    String nome;

    public Internazionale(CapitaneriaDiPorto cp, String nome) {
        this.cp = cp;
        this.nome = nome;
    }
    
    
    
    @Override
    public void run(){
         try {
           // Thread.sleep((int)(Math.random()*10000+10000));
            cp.entraInter(nome);
            Thread.sleep((int)(Math.random()*10000+10000));
            cp.esceInter(nome);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Nazionale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
