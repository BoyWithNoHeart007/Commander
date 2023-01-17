public class arraycal{

    public static void main(String[] args) {
    
    int r,i,j;

    int a[] = {1,2,3,4,5};
    int b[] = {5,4,3,2,1};

    int total[] = new int[10];

    
    for(i=0; i<a.length; i++){
        
        total[i] = a[i]+b[i]; 
    }

    for(i=0; i<a.length; i++){
        System.out.println("Addition = "+ total[i]);

    }
    
    
    
    
    
    
    
    
    
    
    }
}