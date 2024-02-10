import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        //HashMap**********
        HashMap<Integer,Integer>map=new HashMap<>();
         map.put(0,23);
         map.put(1,90);
         System.out.println(map);

         //TreeMap**************8888
         TreeMap<Integer,Integer>t=new TreeMap<>();
         t.put(0,89);
         t.put(1,78);
         t.put(3,88);
         t.put(4,77);
         System.out.println(t);
         System.out.println(t.keySet());

    }
    
}
