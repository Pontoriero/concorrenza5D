/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_martinelli;

/**
 *
 * @author verifica25
 */
public class Calcolatore extends Thread{
    private int v[];
    private int start;
    private int end;

    public Calcolatore(int[] v, int start, int end) {
        this.v = v;
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run(){
        for (int i = start; i < end; i++) {
            v[i]=((int)(Math.sqrt(v[i])))+(end-start);
        }
    }
}
