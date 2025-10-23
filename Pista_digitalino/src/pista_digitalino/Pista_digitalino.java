/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_digitalino;

/**
 *
 * @author verifica25
 */
public class Pista_digitalino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TorreControllo torre = new TorreControllo();
        tipoAereo tipo;
        Thread[] a = new Thread[10];
        for(int i = 0 ; i < 10; i++){
            if(i<=5){
                tipo = tipoAereo.INTERNAZIONALE;
            }else{
                tipo = tipoAereo.NAZIONALE;
            }
            //Aereo aereo = new Aereo("aereo"+i,torre,tipo);
            //a[i] = new Thread(i,aereo.getnome());
            //a[i].start();
        }
    }
    
}
