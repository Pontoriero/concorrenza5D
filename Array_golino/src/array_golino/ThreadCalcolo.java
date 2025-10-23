/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_golino;

import java.util.*;

/**
 *
 * @author verifica
 */
public class ThreadCalcolo implements Runnable{
    private ArrayList<Integer> v1;
    private ArrayList<Integer> r;
    private int pI;
    private int pF;

    public ThreadCalcolo(ArrayList<Integer> v1, ArrayList<Integer> r, int pI, int pF) {
        this.v1 = v1;
        this.r = r;
        this.pI = pI;
        this.pF = pF;
    }

    public ArrayList<Integer> getV1() {
        return v1;
    }

    public void setV1(ArrayList<Integer> v1) {
        this.v1 = v1;
    }

    public ArrayList<Integer> getR() {
        return r;
    }

    public void setR(ArrayList<Integer> r) {
        this.r = r;
    }
    
    public void run(){
        int op;
        for(int i=this.pI; i<this.pF; i++){
            op = (v1.get(0)-v1.get(v1.size()-1))+(int)(Math.sqrt(v1.get(i)));
            r.set(i, op);
        }
    }
    
}
