/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_panesiti;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Aereo implements Runnable{
    private int idAereo;
    TorreControllo t;

    public Aereo(int idAereo, TorreControllo t) {
        this.idAereo = idAereo;
        this.t = t;
    }
    
    public int getIdAereo() {
        return idAereo;
    }

    public void setIdAereo(int idAereo) {
        this.idAereo = idAereo;
    }

    public TorreControllo getT() {
        return t;
    }

    public void setT(TorreControllo t) {
        this.t = t;
    }
    
    
    
    
    
    @Override
    public void run(){
       // idAereo=this.getIdAereo();
        try{
            if(this.idAereo>=1 & this.idAereo<=5){
                t.atterraNazionale(this.getIdAereo());
                t.decollaNazionale();
            }else{
                if(this.idAereo>=6 & this.idAereo<=10){
                    t.atterraInternazionale(this.getIdAereo());
                    t.decollaInternazionale();
                }
            }
        }catch(Exception e){
            System.out.println("errore"+ e.getMessage());
        }
    } 
}
