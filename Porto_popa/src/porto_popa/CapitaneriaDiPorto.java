/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_popa;

/**
 *
 * @author verifica
 */
public class CapitaneriaDiPorto {
    private int nnaz;
    private int nint;
    private int attint;
    private final int n=3;

    public CapitaneriaDiPorto() {
        this.nnaz = 0;
        this.nint = 0;
        this.attint = 0;
    }
    
    public  synchronized void entraNaz(String nome) throws InterruptedException{
        
        while(nint>0 || nnaz==n || attint>0){
            wait();
        }
        nnaz++;
        System.out.println(nome + " e' entrato, nazionali dentro: "+ nnaz);
    }
    public  synchronized void entraInter(String nome) throws InterruptedException{
        attint++;
        while(nnaz>0 || nint==3){
            wait();
            
        }
        attint--;
        nint++;
        System.out.println(nome+ " e' entrato, internazionale dentro: "+ nint);
                
    }
    public  synchronized void esceNaz(String nome){
        nnaz--;
        System.out.println(nome+ " e' uscito, nazionali dentro: "+ nnaz);
        notifyAll();
    }
    public  synchronized void esceInter(String nome){
        nint--;
        System.out.println(nome + " e' uscito, internazionali dentro: "+ nint);
        notifyAll();
    }
  
}
