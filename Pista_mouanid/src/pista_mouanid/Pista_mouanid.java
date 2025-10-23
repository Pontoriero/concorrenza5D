/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_mouanid;

/**
 *
 * @author verifica25
 */
public class Pista_mouanid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aereoporto ap = new Aereoporto();
        for(int i=1;i<11;i++){
            if(i<=5){
                new Nazionali(i,ap).start();
            }else{
                new Internazionali(i,ap).start();
            }
        }

    }
    
}
