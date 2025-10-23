package array_meli;

import java.util.Random;

public class Array_meli {

    public static void main(String[] args) {
        
        int N;
        int K;
        int porz;
        Random random = new Random();
        
        
        N = 12 + random.nextInt(7);
        int v[] = new int[N]; 
        for(int i=0; i<N; i++)
        {
            v[i] = 1+random.nextInt(99);
        }
        
        for(int i=0; i<N; i++){
           System.out.println(v[i]);
        }
        
        K = 3 + random.nextInt(2);
        
        porz = N/K;
        
        int porz1= porz;
        int porz2= porz*2;
        int porz3= porz*3;
        int porz4= porz*4;
        
        if(K==3){
            System.out.println("inizio lavoro");
            Thread t1 = new Thread(new Lavoratore(v,porz1,porz));
            Thread t2 = new Thread(new Lavoratore(v,porz2,porz));
            Thread t3 = new Thread(new Lavoratore(v,porz3,porz));
            
            t1.start();
            t2.start();
            t3.start();
        }
        
        if(K==4){
            System.out.println("inizio lavoro");
            Thread t1 = new Thread(new Lavoratore(v,porz1,porz));
            Thread t2 = new Thread(new Lavoratore(v,porz2,porz));
            Thread t3 = new Thread(new Lavoratore(v,porz3,porz));
            Thread t4 = new Thread(new Lavoratore(v,porz4,porz));
            
            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
        
        if(K==4){
        System.out.println("T1 ha lavorato da " + 0 + " a " + porz1);
        System.out.println("T2 ha lavorato da " + porz1 + " a " + porz2);
        System.out.println("T3 ha lavorato da " + porz2 + " a " + porz3);
        System.out.println("T4 ha lavorato da " + porz3 + " a " + porz4);
        }
        
        if(K==3){
        System.out.println("T1 ha lavorato da " + 0 + " a " + porz1);
        System.out.println("T2 ha lavorato da " + porz1 + " a " + porz2);
        System.out.println("T3 ha lavorato da " + porz2 + " a " + porz3);
        }
        
        
        
        /*
        if(K==3){
            try{
            t1.join();
            t2.join();
            t3.join();
            }catch(InterruptedException e){
                System.out.println("errore");
        }
        }
        
        if(K==4){
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            
        }*/
        
        
}
    
}

    

