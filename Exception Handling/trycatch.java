

import java .util.Scanner;

public class trycatch {

    public static void main (String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int k=sc.nextInt();
        // System.out.println(n/k);   //given exceprtion


        //donot give the exception by using try ans catch

        // try{
        //     int ans=10/0;
        // System.out.println(" your ans is "+ans);
        // } 
        // catch(Exception e){
        //     System.out.println("arithamatic exception");
        // }

        int arr[]=new int[5];

      
        // try{
        //     arr[6]=12/0;

        // }
        // catch(ArithmeticException e){
        //     System.out.println(e.getMessage());  //arithmatic exception
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e.getMessage());  // arrIdexoutof bound exception
        // }

        // or write
        // catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            
        //     System.out.println(e.getMessage());

        // }

        //nested try andcatch************
        try{
            System.out.println("i am in first block");
        // try{
        //     arr[6]=34;
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
        
        try{
            String s=null;   //classNot found exception
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
            
        
        
    }
}