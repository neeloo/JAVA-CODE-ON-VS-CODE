package SCALER;

public class squreroot {
    
    public static void main(String[] args) {
         System.out.println(sqroot(25)); 
    }

   static int sqroot(int n){

    for(int i=1;i<=n;i++){
        if(i*i==n){
            return i;
        }
    }
    return n;

    }
    
}
