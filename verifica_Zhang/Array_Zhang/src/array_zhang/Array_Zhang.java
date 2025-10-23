/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_zhang;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Array_Zhang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int MaxSize=100;
        int N;
        int K;
        int Array[];
        Array = new int[MaxSize];

        int posizione;
        ArrayList<Thread> T =new ArrayList();
        ArrayList<Threadd> s=new ArrayList();
        
        N=(int) (Math.random()*20+10);
        K=(int) (Math.random()*4+3);
        int Parti=N/K;
        for(int i=0;i<N;i++){
            Array[i]=(int) (Math.random()*100);
        }
        for(int i=0;i<K;i++){
            posizione=i*Parti;
            int a[]=new int[MaxSize];
            for(int j=0;j<Parti;j++){
              a[j]=Array[j+posizione];  
            }
            Threadd S=new Threadd(posizione,a,Parti);
            s.add(S);
            Thread thread = new Thread(S);
            T.add(thread);
        }
        for(int i=0;i<T.size();i++){
            T.get(i).start();
        }
        for(int i=0;i<T.size();i++){
            try {
                T.get(i).join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Array_Zhang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(int i=0;i<s.size();i++){
            double risultato = s.get(i).getRisultato();
            System.out.println("nella "+i+"cella il risultato e' "+risultato);
                  
        }
 
    }
    
}
