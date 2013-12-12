package onlyfun.caterpillar;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class PrimeCallable implements Callable<int[]> {
    private int max;
	
    public PrimeCallable(int max) {
    	this.max = max;
    }
	
    public int[] call() throws Exception {
        int[] prime = new int[max+1]; 
        
        List<Integer> list = new ArrayList<Integer>(); 

        for(int i = 2; i <= max; i++) 
            prime[i] = 1; 

        for(int i = 2; i*i <= max; i++) { // 這邊可以改進 
            if(prime[i] == 1) { 
                for(int j = 2*i; j <= max; j++) { 
                    if(j % i == 0) 
                        prime[j] = 0; 
                } 
            } 
        } 

        for(int i = 2; i < max; i++) { 
            if(prime[i] == 1) { 
                list.add(i); 
            } 
        }
        
        int[] p = new int[list.size()];
        for(int i = 0; i < p.length; i++) {
        	p[i] = list.get(i).intValue();
        }
        
        return p;
    }
	
}