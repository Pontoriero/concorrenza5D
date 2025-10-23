/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_mouanid;

/**
 *
 * @author verifica25
 */
public class Radice extends Thread {

    private int v[];
    private int vFinale[];
    private int start;
    private int end;

    public Radice(int[] v, int[] vFinale, int start, int end) {
        this.v = v;
        this.vFinale = vFinale;
        this.start = start;
        this.end = end;
    }

    Radice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            vFinale[i] = (int) (Math.sqrt(v[i]) + (end - start));
            System.out.println(Thread.currentThread().getName() + " ha calcolato al posto " + (i+start) + " il nuumero: "+ vFinale[i] );

        }

    }
}
