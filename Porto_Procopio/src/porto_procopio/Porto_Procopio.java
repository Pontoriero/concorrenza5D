/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porto_procopio;

/**
 *
 * @author verifica
 */
public class Porto_Procopio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CapitaneriaDiPorto c1 = new CapitaneriaDiPorto();
        for(int i=0; i<5; i++){
            new Thread(new NaviNazionali("Nave Nazionale : " + i,c1)).start();
            new Thread(new NaviInternazionali("Nave internazionale :" + i,c1)).start();
        }
        
        
    }
    
}
