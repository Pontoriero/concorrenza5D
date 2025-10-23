/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pista_digitalino;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica25
 */
public class Aereo implements Runnable{

    public final String nome;
    public final TorreControllo torre;
    public final tipoAereo tipo;
    public final Random rand = new Random();

    public Aereo(String nome, TorreControllo torre, tipoAereo tipo) {
        this.nome = nome;
        this.torre = torre;
        this.tipo = tipo;
    }

    public String getnome() {
        return nome;
    }

    @Override
    public void run(){
        try {
            System.out.println("aereo " + Thread.currentThread().getName() + tipo + " ha chiesto di entrare");
            if (tipo == tipoAereo.INTERNAZIONALE) {
                torre.entraInternazionale();
                System.out.println("aereo " + Thread.currentThread().getName() + tipo + " è sulla pista");
                Thread.sleep((long) (Math.random() * 2000 + 2000));
                torre.esciInternazionale();
            } else {
                torre.entraNazionale();
                System.out.println("aereo " + Thread.currentThread().getName() + tipo + " è sulla pista");
                Thread.sleep((long) (Math.random() * 2000 + 2000));
                torre.esciNazionale();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Aereo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
