/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_campani;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class CapitaneriaDiPorto {
    
    // inzializzazioni 
    
    private int portiOccupati = 0; 
    private final int CAP; // --> capacità dei porti (3) 
    private int attesaNaz = 0; 
    private int attesaInt = 0; 
    
    
    private int naveCorrente = 0; // se a 0 nessuno, 1 NAZIONALI, 2 INTERNAZIONALI 
    
    // Controllo per la starvation 
    private int contaInt = 0; 
    private static final int MAX_INT = 5; // mi serve a sapere se il porto è gia saturo  
    

    // COSTRUTTORE DELLA CAPITANERIA 
    public CapitaneriaDiPorto(int CAP) {
        this.CAP = CAP;
    }
    
    
    
    // entra NAZIONALE 
    
    public synchronized void entraNazionale(){
        attesaNaz++; 
        while(portiOccupati == CAP  || naveCorrente == 2   || (naveCorrente == 0  && attesaInt > 0  && contaInt < MAX_INT)){ 
            try {
                    // CONTROLLO CHE NON SI SIA ANCORA SATURATO
                    wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(CapitaneriaDiPorto.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        }
        
        attesaNaz--;
        portiOccupati++; 
        naveCorrente = 1;
        contaInt = 0; 
         System.out.println(Thread.currentThread().getName() + " : NAZIONALE ha ATTRACCATO. Porti Occupati " + portiOccupati );
        
    }
    
        public synchronized void entraInternazionale(){
        attesaInt++; 
        while(portiOccupati == CAP || naveCorrente == 1  || (naveCorrente == 0 && attesaNaz > 0 && contaInt >= MAX_INT)){ 
            try {
                    // CONTROLLO CHE NON SI SIA ANCORA SATURATO
                    wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(CapitaneriaDiPorto.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        }
        
        attesaInt--;
        portiOccupati++; 
        naveCorrente = 2;
        contaInt++; 
        
            System.out.println(Thread.currentThread().getName() + " : INTERNAZIONALE ha ATTRACCATO. Porti Occupati " + portiOccupati );
        
    }
        
        
        // ESCI NAZIONALE E INTERNAZIONALE 
        
        public synchronized void esciNazionale(){
            portiOccupati--;
            System.out.println(Thread.currentThread().getName() + ": NAZIONALE sta uscendo dal porto. Porti occupati:  " + portiOccupati);
            if(portiOccupati == 0){
                naveCorrente = 0; 
            }
            
            notifyAll();
        }
    
        
        public synchronized void esciInternazionale(){
            portiOccupati--;
            System.out.println(Thread.currentThread().getName() + ": INTERNAZIONALE sta uscendo dal porto. Porti occupati:  " + portiOccupati);
            if(portiOccupati == 0){
                naveCorrente = 0; 
            }
            
            notifyAll();
        }
    
}
