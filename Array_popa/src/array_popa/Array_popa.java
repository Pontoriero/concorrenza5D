/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_popa;
import java.util.*;
/**
 *
 * @author verifica
 */
public class Array_popa {

    
    public static void main(String[] args) {
        Random rand= new Random();
        int start,fine;
        int n = rand.nextInt(6)+12;
        int v[]= new int [n];
        int k= rand.nextInt(1)+3;
        int vFinale[]= new int [n];
        
        for(int i=0;i<n;i++){
            v[i]= rand.nextInt(99)+1;
            System.out.println("valore al posto " + i +": "+ v[i]);
        }
            
            new Thread(new gestArr(v,vFinale)).start();
            
        
        
    }
    
}
