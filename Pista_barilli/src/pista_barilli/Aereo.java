/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_barilli;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Aereo implements Runnable{
    private int id;
    private TorreControllo x;

    public Aereo(int id, TorreControllo x) {
        this.id = id;
        this.x = x;
    }
    

    public int getId() {
        return id;
    }

    public TorreControllo getX() {
        return x;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setX(TorreControllo x) {
        this.x = x;
        
    }

    @Override
    public void run() {
        this.x.entra();
        if(this.id>=5){
            try {
                this.x.entraInternazionale();
                Thread.sleep((long) (Math.random()*10000+10000));
                this.x.uscitaInternazionale();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Aereo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                this.x.entranazionale();
                Thread.sleep((long) (Math.random()*10000+10000));
                this.x.uscitanazionale();
               
            } catch (InterruptedException ex) {
                Logger.getLogger(Aereo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

}
