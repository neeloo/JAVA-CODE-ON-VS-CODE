
package Generice.java;

import java.util.ArrayList;

public class Generic {
   
   @SuppressWarnings("unchecked")
   public static void main(String[] args) {

   ArrayList<Integer> a=new ArrayList<>();

     // a.add("str1");
      a.add(90);
      a.add(78);
      int n=(int)a.get(2);
     // System.out.println(a);

     myj <String>g=new myj(55, "mystring");

      String s=g.getT1();
      System.out.println(s);


    
   } 
}



class myj<T1>{
int val;
private T1 t1;

public myj(int val,T1 t1){
   this.val=val;
   this.t1=t1;

}
int getVal(){
   return val;
}

void setVal(int val){
this.val=val;
}

T1 getT1(){
   return t1;
}

void setT1(T1 t1){
   this.t1=t1;
}


}
