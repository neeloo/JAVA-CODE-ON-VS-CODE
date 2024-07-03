package otherExample;

public class Revision {

    public static void main(String[] args) {
        String s="abcd";
        String ns=" ";
        for( int i=s.length()-1;i>=0;i--){
            ns+=s.charAt(i);
        }
       System.out.println(ns);
    }
    
}
