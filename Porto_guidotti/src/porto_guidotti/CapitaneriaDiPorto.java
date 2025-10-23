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
public class CapitaneriaDiPorto {
    private int naviInterAttesa;
    private int naviInterBanchina;
    private int naviNazAttesa;
    private int naviNazBanchina;
    private final int maxPerBanchina = 3;
    private final int maxNaviTot = 3;
    private int nBanchina1;
    private int nBanchina2;
    private int nBanchina3;
    private int naviNazBanchina1;
    private int naviNazBanchina2;
    private int naviNazBanchina3;
    private int naviInterBanchina1;
    private int naviInterBanchina2;
    private int naviInterBanchina3;
    
    
    public synchronized void Banchina1Naz() throws InterruptedException{
        this.naviNazAttesa++;
        while(this.nBanchina1 >= this.maxPerBanchina || this.naviNazBanchina >= this.maxNaviTot || this.naviInterAttesa >= 0 || this.naviInterBanchina1 >= 0){
            System.out.println(Thread.currentThread().getName() + " Nave Nazionale sto aspettando l'ATTRACCO");
            wait();
        }
        this.naviNazAttesa--;
        this.naviNazBanchina++;
        this.naviNazBanchina1++;
        System.out.println(Thread.currentThread().getName() +" Sono Entrato nella Banchina");
    }
    
    public synchronized void Banchina1NazEsci(){
        this.naviNazBanchina1--;
        this.naviNazBanchina--;

        System.out.println(Thread.currentThread().getName() + " Sono uscito dalla banchina");
        notifyAll();
    }
    
    public synchronized void Banchina2Naz() throws InterruptedException{
        this.naviNazAttesa++;
        while(this.nBanchina2 >= this.maxPerBanchina || this.naviNazBanchina >= this.maxNaviTot || this.naviInterAttesa >= 0 || this.naviInterBanchina2 >= 0){
            System.out.println(Thread.currentThread().getName() + " Nave Nazionale sto aspettando l'ATTRACCO");
            wait();
        }
        this.naviNazAttesa--;
        this.naviNazBanchina2++;
        this.naviNazBanchina++;

        System.out.println(Thread.currentThread().getName() +" Sono Entrato nella Banchina");
        
    }
    
    public synchronized void Banchina2NazEsci(){
        this.naviNazBanchina2--;
        this.naviNazBanchina--;

        System.out.println(Thread.currentThread().getName() + " Sono uscito dalla banchina");
        notifyAll();
    }
    
    
    public synchronized void Banchina3Naz() throws InterruptedException{
        this.naviNazAttesa++;
        while(this.nBanchina3 >= this.maxPerBanchina || this.naviNazBanchina >= this.maxNaviTot || this.naviInterAttesa >= 0 || this.naviInterBanchina3 >= 0){
            System.out.println(Thread.currentThread().getName() + " Nave Nazionale sto aspettando l'ATTRACCO");
            wait();
        }
        this.naviNazAttesa--;
        this.naviNazBanchina3++;
        this.naviNazBanchina++;

        System.out.println(Thread.currentThread().getName() +" Sono Entrato nella Banchina");

    }
    
    public synchronized void Banchina3NazEsci(){
        this.naviNazBanchina3--;
        this.naviNazBanchina--;

        System.out.println(Thread.currentThread().getName() + " Sono uscito dalla banchina");
        notifyAll();
    }

    
    public synchronized void Banchina1Inter() throws InterruptedException{
        this.naviInterAttesa++;
        while(this.nBanchina1 >= this.maxPerBanchina || this.naviInterBanchina >= this.maxNaviTot || this.naviNazBanchina1 >= 0){
            System.out.println(Thread.currentThread().getName() + " Nave Internazionale sto aspettando l'ATTRACCO");
            wait();
        }
        this.naviInterAttesa--;
        this.naviInterBanchina1++;
        this.naviInterBanchina++;
        
        
        System.out.println(Thread.currentThread().getName() +" Sono Entrato nella Banchina");
       
        
    }
    
    public synchronized void Banchina1InterEsci(){
        this.naviInterBanchina1--;
        this.naviNazBanchina--;

        System.out.println(Thread.currentThread().getName() + " Sono uscito dalla banchina");
        notifyAll();
    }
    public synchronized void Banchina2Inter() throws InterruptedException{
        this.naviInterAttesa++;
        while(this.nBanchina2 >= this.maxPerBanchina || this.naviInterBanchina >= this.maxNaviTot || this.naviNazBanchina2 >= 0){
            System.out.println(Thread.currentThread().getName() + " Nave Internazionale sto aspettando l'ATTRACCO");
            wait();
        }
        this.naviInterAttesa--;
        this.naviInterBanchina2++;
        this.naviInterBanchina++;
        
        
        System.out.println(Thread.currentThread().getName() +" Sono Entrato nella Banchina");
       
        
    }
    
    public synchronized void Banchina2InterEsci(){
        this.naviInterBanchina2--;
        this.naviNazBanchina--;

        System.out.println(Thread.currentThread().getName() + " Sono uscito dalla banchina");
        notifyAll();
    }
    public synchronized void Banchina3Inter() throws InterruptedException{
        this.naviInterAttesa++;
        while(this.nBanchina1 >= this.maxPerBanchina || this.naviInterBanchina >= this.maxNaviTot || this.naviNazBanchina3 >= 0){
            System.out.println(Thread.currentThread().getName() + " Nave Internazionale sto aspettando l'ATTRACCO");
            wait();
        }
        this.naviInterAttesa--;
        this.naviInterBanchina3++;
        this.naviInterBanchina++;
        
        
        System.out.println(Thread.currentThread().getName() +" Sono Entrato nella Banchina");
       
        
    }
    
    public synchronized void Banchina3InterEsci(){
        this.naviInterBanchina3--;
        this.naviNazBanchina--;

        System.out.println(Thread.currentThread().getName() + " Sono uscito dalla banchina");
        notifyAll();
    }

    
    
}
