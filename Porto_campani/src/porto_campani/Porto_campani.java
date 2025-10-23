/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_campani;

/**
 *
 * @author verifica
 */
public class Porto_campani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Inizializzazione classe 
        CapitaneriaDiPorto cap =  new  CapitaneriaDiPorto(3); // LA CAPACITA è DI 3 
        
        
        Thread[] th = new Thread[10]; 
        
        
        for (int i = 0; i < 10; i++) {
            
            TipoNave tipo; 
            if(i < 5){
                tipo = TipoNave.NAZIONALE;
            } else {
                tipo = TipoNave.INTERNAZIONALE;
            }
            Nave n = new Nave("Nave: " + (i+1) +  " ", cap, tipo);
            th[i] = new Thread(n, n.getNome());
            th[i].start();
            
        }
        
        
        try{
            
            for (int i = 0; i < th.length; i++) {
                th[i].join();
            }
            
        }catch(InterruptedException e){
            System.out.println("Fine anticipata");
        }
        
        System.out.println("Fine programma");
        
    }
    
}
