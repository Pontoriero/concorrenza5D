
package pista_martinelli;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TorreControllo {
    private final int nPiste=3;
    private int internazionaliSuPista;
    private int nazionaliSuPista;
    private int internazionaliInAttesa;
    //per evitare la starvation ogni volta che un aereo internazionale
    //cerca di atterrare controlla se sono entrati troppi internazionali di fila, nel caso aspetta
    //ogni 9 internazionali di fila entrano 3 nazionali evitando così la problematica
    private static int troppiInternazionali=0;

    public TorreControllo() {
        this.internazionaliSuPista = 0;
        this.nazionaliSuPista = 0;
        this.internazionaliInAttesa = 0;
    }
    
    public synchronized void esceNazionale(){
        nazionaliSuPista--;
        notifyAll();
    }
    
    public synchronized void esceInternazionale(){
        internazionaliSuPista--;
        notifyAll();
    }
    
    public synchronized void entraNazionale(){
        int tentativi=0; 
        while((internazionaliSuPista!=0 || nazionaliSuPista==nPiste || internazionaliInAttesa!=0)&&(tentativi<1 ||internazionaliSuPista!=0 || nazionaliSuPista==nPiste)){
            
            try {
                tentativi++;
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TorreControllo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        nazionaliSuPista++;
        troppiInternazionali-=3;
    }
    
    public synchronized void entraInternazionale(){
        internazionaliInAttesa++;
         while(nazionaliSuPista!=0 || internazionaliSuPista==nPiste||troppiInternazionali==9){
             try {
                 wait();
             } catch (InterruptedException ex) {
                 Logger.getLogger(TorreControllo.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        internazionaliInAttesa--;
        internazionaliSuPista++;
        troppiInternazionali++;
    }
    
}
