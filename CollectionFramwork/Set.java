import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        //set is unorderd collection and do not allow dublicate value .and  store unique value
        //HashSet***********
        HashSet<Integer>hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        System.out.println(hs);
        hs.remove(hs);
        System.out.println("hashset="+hs);

        //LinkesHashSet***************
        // LinkesHashSet<Integer>ls = new LinkedHashSet<>();
        // ls.add(100);
        // ls.add(200);
        // ls.add(300);
        // System.out.println(ls);

        //TreeSet******(sorted and unique)
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(100);
        ts.add(300);
        ts.add(200);
        ts.add(400);
        System.out.println(ts);
        ts.remove(400);
        System.out.println(ts);

    }
}
