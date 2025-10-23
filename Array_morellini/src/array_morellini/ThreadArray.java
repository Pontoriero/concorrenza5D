/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_morellini;

/**
 *
 * @author verifica25
 */
public class ThreadArray implements Runnable{
    
    private int lArray;
    private int k;
    private int[] array;
    private int nThread;
    
    public ThreadArray(int lArray, int k, int[] array, int nThread){
        this.lArray = lArray;
        this.k = k;
        this.array = array;
        this.nThread = nThread;
    }

    public int getlArray() {
        return lArray;
    }

    public void setlArray(int lArray) {
        this.lArray = lArray;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getnThread() {
        return nThread;
    }

    public void setnThread(int nThread) {
        this.nThread = nThread;
    }

    public int getParteArray() {
        return parteArray;
    }

    public void setParteArray(int parteArray) {
        this.parteArray = parteArray;
    }

    private int parteArray;
    private int somma[] = new int[lArray];
    
    public int[] getSomma(){
        return this.somma;
    }
    
    @Override
    public void run(){
        
        if (k == 0) this.parteArray = 0;
        else this.parteArray = lArray / k;
        
        for (int i = nThread * parteArray; i < (nThread * parteArray); i++){
            if (i == lArray) break;
            
            if (array[i] < 10){
                this.somma[i] = array[i] * i;
            }
            else{
                this.somma[i] = ((int)array[i] / 10 + (int)array[i] % 10) * i;
            }
        }
    }
    
}
