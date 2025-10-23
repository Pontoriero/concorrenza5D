/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_guidotti;

/**
 *
 * @author verifica
 */
public class MioThread implements Runnable{
    private int[] arr;
    private int nThread;
    private int id;

    public MioThread(int[] arr, int nThread, int id) {
        this.arr = arr;
        this.nThread = nThread;
        this.id = id;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getnThread() {
        return nThread;
    }

    public void setnThread(int nThread) {
        this.nThread = nThread;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " di ID "+ this.id + " sto lavorando");
        for(int i = id; i<arr.length; i+=nThread){
            int dec = 0, un = 0;
            //System.out.println(Thread.currentThread().getName() + " sto lavorando al numero "+ i);
            
            for(int j = 0; j<arr[i]; j++){
                if(j%10 == 0 && j>10){
                    dec++;
                    un=0;
                }
                else{
                    un++;
                }
            }
            System.out.println(Thread.currentThread().getName() + " il numero "+ i+ " ha: "+(dec+1)+" decine e: "+(un+1)+" unita");
            dec++;
            un++;
            arr[i] = (dec+un)*i;
            
            
        }
    }
}
