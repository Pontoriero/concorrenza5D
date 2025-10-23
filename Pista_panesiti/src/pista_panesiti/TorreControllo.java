/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_panesiti;

/**
 *
 * @author verifica
 */
public class TorreControllo extends Thread{
    //definizione contatori
    int contNaz = 0;
    int contInt = 0;
    int contAttesaNaz = 0;
    int contAttesaInt = 0;
    
    //definizione id aerei
    int idNaz;
    int idInt;

    public TorreControllo() {
    }

    
    
    public int getIdNaz() {
        return this.idNaz;
    }

    public int getIdInt() {
        return this.idInt;
    }

    public void setIdNaz(int idNaz) {
        this.idNaz = idNaz;
    }

    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }
    
    
    
    //decollo aereo internazionale
    public synchronized void decollaInternazionale(){
        contNaz--;
        System.out.println("L'aereo internazionale " + this.idInt + " è decollato liberando la pista.");
        notifyAll();
    }
    
    //decollo aereo nazionale
    public synchronized void decollaNazionale(){
        contNaz--;
        System.out.println("L'aereo nazionale " + this.idNaz + " è decollato liberando la pista.");
        notifyAll();
    }
    
    //atterraggio aereo internazionale
    public synchronized void atterraInternazionale(int idInt) throws InterruptedException{
        contAttesaInt++;
        System.out.println("L'aereo internazionale " + this.idInt + " richiede l'accesso alla pista.");
        while(contNaz>0 || contInt>=3){
           wait(); 
        }
        contAttesaInt--;
        System.out.println("L'aereo internazionale " + this.idInt + " atterra.");
        contInt++;
        System.out.println("L'aereo internazionale " + this.idInt + " occupa la pista.");
        //this.sleep((int) Math.random()*10000+10000);
        this.sleep(2000);
        
    }
    
    //atterraggio aereo nazionale
    public synchronized void atterraNazionale(int idNaz) throws InterruptedException{
        contAttesaNaz++;
        System.out.println("L'aereo nazionale " + this.idNaz + " richiede l'accesso alla pista.");
        while(contInt>0 || contNaz>=3 || contAttesaInt>0){
           wait(); 
        }
        contAttesaNaz--;
        System.out.println("L'aereo nazionale " + this.idNaz + " atterra.");
        contNaz++;
        System.out.println("L'aereo nazionale " + this.idNaz + " occupa la pista.");
        //this.sleep((int) Math.random()*10000+10000);
        this.sleep(2000);
    }
    
    
}
