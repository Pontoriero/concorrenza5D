/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_torre;

/**
 *
 * @author verifica
 */
public class DivisioneV extends Thread{
    
    private int v[];
    private int start;
    private int end;
    private int vOut[];

    public DivisioneV(int[] v, int start, int end, int[] vOut) {
        this.v = v;
        this.start = start;
        this.end = end;
        this.vOut = vOut;
    }
   
    
    
    @Override
    public void run(){
        for (int i = start; i < end; i++) {
            vOut[i] = (int)Math.sqrt(v[i])+(start-end);
            System.out.println("Vettore in posizione " + i +" : " + vOut[i]);
        }
        
    }
    
    
    
    
}
