/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_golino;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class AereoInternazionale extends Thread{
    private int nome;
    private TorreControllo torre;

    public AereoInternazionale(int nome, TorreControllo t) {
        this.nome = nome;
        this.torre = t;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public TorreControllo getT() {
        return torre;
    }

    public void setT(TorreControllo torre) {
        this.torre = torre;
    }
    
    @Override
    public void run(){
        try {
            torre.entraAereoInt(this.nome);
            Thread.sleep(3000);
            System.out.println("L'aereo internazionale e' in pista...");
            torre.esceAereoInt(nome);
        } catch (InterruptedException ex) {
            Logger.getLogger(AereoNazionale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
