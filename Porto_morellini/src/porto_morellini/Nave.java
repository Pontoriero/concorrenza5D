/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_morellini;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica25
 */
public class Nave extends Thread{
    
    private int id;
    private CapitaneriaDiPorto c;
    
    public Nave(int id, CapitaneriaDiPorto c){
        this.id = id;
        this.c = c;
    }
    
    

    
    
    @Override
    public void run(){
        
        int random = (int) ((Math.random() * 10000) + 5000);
        
        if (id <= 5){
            try {
                c.entraNazionale(id);
                Thread.sleep(random);
                c.esceNazionale(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(Nave.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                c.entraInternazionale(id);
                Thread.sleep(random);
                c.esceInternazionale(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(Nave.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
