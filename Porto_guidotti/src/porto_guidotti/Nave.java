/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_guidotti;

import java.util.Random;

/**
 *
 * @author verifica
 */
public class Nave implements Runnable{
    private String categoria;
    private int id;
    private CapitaneriaDiPorto cap;

    public Nave(String categoria, int id, CapitaneriaDiPorto cap) {
        this.categoria = categoria;
        this.id = id;
        this.cap = cap;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CapitaneriaDiPorto getCap() {
        return cap;
    }

    public void setCap(CapitaneriaDiPorto cap) {
        this.cap = cap;
    }
    
    @Override
    public void run(){
        Random rand = new Random();
        try {
            Thread.sleep(rand.nextInt(10000));
        
        if(this.categoria.equals("NAZIONALE")){
            this.cap.Banchina1Naz();
            this.cap.Banchina2Naz();
            this.cap.Banchina3Naz();
            Thread.sleep(rand.nextInt(10000)+10000);
            this.cap.Banchina1NazEsci();
            this.cap.Banchina2NazEsci();
            this.cap.Banchina3NazEsci();
            
        }else if(this.categoria.equals("INTERNAZIONALE")){
            this.cap.Banchina1Inter();
            this.cap.Banchina2Inter();
            this.cap.Banchina3Inter();
            Thread.sleep(rand.nextInt(10000)+10000);
            this.cap.Banchina1InterEsci();
            this.cap.Banchina2InterEsci();
            this.cap.Banchina3InterEsci();

        }
        
        } catch (InterruptedException ex) {
            System.out.println("ERRORE: "+ex.getMessage());
        }
        
    }
        
}
