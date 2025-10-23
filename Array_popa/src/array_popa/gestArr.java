/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_popa;


public class gestArr  implements Runnable{
    private int[] v1,v2;
    int decine;
    int unita;
    int cu=0;
    int ris;
    public gestArr(int[] v1, int[] v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
    
    
    @Override
    public void run(){
        
    for(int i=0;i<v1.length;i++){
        decine= v1[i]/10;
        //System.out.println("decine: "+ decine);
        unita= v1[i]%10;
        //System.out.println("unita: "+unita);
        ris=(decine+unita)*i;
        System.out.println("risultato posto "+i+": "+ris);
    }    
        
    }
    
}
