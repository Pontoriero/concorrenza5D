/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_guidotti;

/**
 *
 * @author verifica
 */
public class Porto_guidotti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CapitaneriaDiPorto c = new CapitaneriaDiPorto();
        for(int i = 0; i<5; i++){
            new Thread(new Nave("NAZIONALE",i,c)).start();
        }
        for(int i = 5; i<10; i++){
            new Thread(new Nave("INTERNAZIONALE",i,c)).start();
        }
        
    }
    
}
