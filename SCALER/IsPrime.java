package SCALER;

public class IsPrime {
    public static void main(String[] args) {
        int n=20;
        boolean ans=isPrime(n);
        System.out.println(ans);



        boolean result=prime(10);
        System.out.println(result);
       
    }

    //type-1  tm=o(n)
    public static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
            if(c==2){
                return true;
            }
        }
        return false;
    }


     //type-2   tm=o(root(n))
    public static boolean prime(int k){
        int count=0;
        for(int i=1;i*i<=k;i++){
            if(k%i==0){
                if(i*i==k) count++;
                else count+=2;
            }
            if(count==2) return true;  
        }
        return false;
    }

    
}
