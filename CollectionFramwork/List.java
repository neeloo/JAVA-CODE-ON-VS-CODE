import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

class List {
    public static void main(String[] args) {
        //list is orderd but not sorted
        //ArrayList************
        ArrayList<Integer>al=new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(12);
        al.add(90);
        al.add(90);
        System.out.println(al);
        al.remove(0);
        al.add(2,1100);
        System.out.println("ArrayList ="+al);

        //LinkedList*******************
        // LiskedList<Integer>ll= new LinkedList<>();
        // ll.add(10);
        // ll.add(20);
        // ll.add(40);
        // System.out.println(ll);


        //Vector*********
        Vector<String>v=new Vector<>();
        v.add("10");
        v.add("20");
        v.add("30");
        System.out.println(v);
        v.remove(0);
        System.out.println("vector ="+v);

        //Stack***************
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.peek();
        System.out.println("stack = "+st);

    }
}