package porto_meli;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CapitaneriaDiPorto {
    
    private final int capacita = 3;
        private int contNaz = 0;
        private int contInter = 0;
        private int attesaInter = 0;
        
        public synchronized void entraInter(){
            attesaInter++;
            while(contNaz>0 || contInter==capacita){
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Porto_meli.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            attesaInter--;
            contInter++;
        }
        
        public synchronized void entraNaz(){
            while(contInter>0 || contNaz==capacita ||attesaInter>0){
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Porto_meli.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            contNaz++;
        }
        
        public synchronized void esceInter(){
            contInter--;
                    
            notifyAll();
        }
        
        public synchronized void esceNaz(){
            contNaz--;
                    
            notifyAll();
        }
    
}
