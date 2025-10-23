package porto_meli;

import java.util.logging.Level;
import java.util.logging.Logger;

public class INTERNAZIONALI implements Runnable{
    
    private final String ID;
    public CapitaneriaDiPorto p;
    
    INTERNAZIONALI(String nome, CapitaneriaDiPorto cap){
        this.ID = nome;
        this.p = cap;
    }

    @Override
    public void run() {
        System.out.println(this.ID + " vuole entrare al porto");
        p.entraInter();
        System.out.println(this.ID + " entra nel porto");
        
        try {
            Thread.sleep((long) ((int) 10000 + Math.random()*10000));
        } catch (InterruptedException ex) {
            Logger.getLogger(NAZIONALI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        p.esceInter();
        System.out.println(this.ID + "lascia il porto");
    }
    
}
