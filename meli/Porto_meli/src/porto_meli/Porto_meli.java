package porto_meli;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Porto_meli {

    
    public static void main(String[] args){
        
        CapitaneriaDiPorto porto = new CapitaneriaDiPorto();
        ArrayList<Thread> navi = new ArrayList<>();
        
        navi.add(new Thread(new NAZIONALI("1",porto)));
        navi.add(new Thread(new NAZIONALI("2",porto)));
        navi.add(new Thread(new NAZIONALI("3",porto)));
        navi.add(new Thread(new NAZIONALI("4",porto)));
        navi.add(new Thread(new NAZIONALI("5",porto)));
        navi.add(new Thread(new INTERNAZIONALI("6",porto)));
        navi.add(new Thread(new INTERNAZIONALI("7",porto)));
        navi.add(new Thread(new INTERNAZIONALI("8",porto)));
        navi.add(new Thread(new INTERNAZIONALI("9",porto)));
        navi.add(new Thread(new INTERNAZIONALI("10",porto)));
        
        for(Thread t : navi){
            t.start();
            
            
        }
        
        for(Thread t : navi){
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Porto_meli.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
