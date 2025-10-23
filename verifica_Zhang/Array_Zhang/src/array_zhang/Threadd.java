/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_zhang;

/**
 *
 * @author verifica
 */
public class Threadd implements Runnable{
    
    private int a[];
    private int posizione;
    private double risultato;
    private int posizioneiniziale;
    private int salti;

    public Threadd(int posizione,int a[],int salti) {
        this.posizione = posizione;
        this.posizioneiniziale=posizione;
        this.a=a;
        this.salti=salti;
    }

    public double getRisultato() {
        return risultato;
    }
    
    

    @Override
    public void run(){
        for(int i=posizioneiniziale;i<salti;i++)           
        risultato=Math.sqrt(a[i])+(i-posizioneiniziale);
    }
    
}
