/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_procopio;

/**
 *
 * @author verifica
 */
public class MyArray {
    private int[] v1 = new int[(int) (Math.random() * (18 - 12) + 1)];


    public int[] getV1() {
        return v1;
    }

    public void setV1(int[] v1) {
        this.v1 = v1;
    }
    
    public void inserisci(){
       for(int i=0; i<v1.length; i++){
          v1 = (Math.random() * 98 + 1);
       }
    }
    
    
    
    
}
