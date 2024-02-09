//import java.util Scanner;

public  class tryfinally {
    public static void main(String[] args) throws Exception {

        // finally keyword
        // try{
        //     int n=12/0;
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
        // finally{
        //     System.out.println(" it is always executed");
        // }

        //throw ketword

        // int age=2;
        // if(age<12){
        //     //System.out.println("not good");  //normal staatement
        //     //using throw 
        //     throw new RuntimeException("not good");
        // }
        // else{
        //     System.out.println("good");
        // }


        //throws Keyword
        demo(10,0);
        
    }
    
    static void demo(int a,int b){
        System.out.println("ans" +a/b);
    }
    
}
