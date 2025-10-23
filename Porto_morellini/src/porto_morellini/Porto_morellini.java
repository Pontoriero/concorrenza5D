/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_morellini;

import java.util.ArrayList;

/**
 *
 * @author verifica25
 */
public class Porto_morellini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CapitaneriaDiPorto c = new CapitaneriaDiPorto();
        
        int[] arrayId = new int[11];
        
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                arrayId[i] = i;
            }
            else{
                arrayId[i] = 10 - i;
            }
           
        }
        
        //gli id devono essere presi random
        for (int i = 1; i <= 10; i++){
            Nave n = new Nave(arrayId[i], c);
            
            n.start();
        }
        
    }
    
}
