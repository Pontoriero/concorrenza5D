package array_meli;

public class Lavoratore implements Runnable{
    
    private int v[];
    private int porzione;
    private int parti;
    private int temp;
    private int temp1;
    private int temp2;
    private int temp3;
    private int temp4;
    
    
    Lavoratore(int vet[], int por, int parti){
        this.v=vet;
        this.porzione=por;
        this.parti=parti;
    }

    @Override
    public void run() {
        for(int i=porzione; i<porzione + parti; i++)
        {
            temp = v[i];
            temp1 = temp / 10;
            temp2 = temp % 10;
            temp3 = temp1 + temp2; 
            temp4 = i*temp3;
            
            
            
            v[i]= temp4;
            
            System.out.println(v[i]);
        }
    }
    
    
    
}
