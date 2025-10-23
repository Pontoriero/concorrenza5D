/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_migale;

/**
 *
 * @author verifica
 */
public class Processo implements Runnable{
    
    private int inizio;
    private int fine;
    private int a[];

    public Processo(int inizio, int fine, int[] a) {
        this.inizio = inizio;
        this.fine = fine;
        this.a = a;
    }


    @Override
    public void run() {
        for(int i = inizio; i<fine+1;i++){
            a[i] = ((int) Math.sqrt(a[i]))+(fine-inizio);
        }
    }
    
}
