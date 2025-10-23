/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_vacondio;

/**
 *
 * @author verifica
 */
public class Sommavalore implements Runnable{
    private int v1;
    private int v2;
    private int somma[];
    private int lunghezza;

    public Sommavalore(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int[] getSomma() {
        return somma;
    }

    public void setSomma(int[] somma) {
        this.somma = somma;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }
    
    @Override
    public void run(){
        lunghezza = (int) ((Math.random()*12)+1);
        for (int i = 0; i <= lunghezza; i++) {
            somma[i] = (v1 + v2) * i ;
            System.out.println(" la somma e " + somma);
        }
    }
    
}
