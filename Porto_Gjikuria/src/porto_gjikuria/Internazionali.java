/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_gjikuria;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Internazionali implements Runnable{
    
    private String id;
    CapitaneriaDiPorto p;

    public Internazionali(String id, CapitaneriaDiPorto p) {
        this.id = id;
        this.p = p;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random()*10000 +10000  ));
            p.entrataInternazionali();
            Thread.sleep((int) (Math.random()*10000 + 10000  ));
            p.uscitaInternazionali();
        } catch (InterruptedException ex) {
            Logger.getLogger(Nazionali.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
