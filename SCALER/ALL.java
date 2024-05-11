import java.util.ArrayList;
import java.util.Arrays;

public class ALL {

   public static void main(String[] args) {
      // String s="";
      // int c= s.codePointAt(0);

      // question-2
      // ArrayList<String> languages= new ArrayList<>();

      // // Add elements in the array list
      // languages.add("Java");
      // languages.add("Python");
      // languages.add("JavaScript");
      // System.out.println("ArrayList: " + languages);

      // // convert the arraylist into a string
      // String arraylist = languages.toString();
      // System.out.println("String: " + arraylist);

      ArrayList<String> list = new ArrayList<>();
      list.add("This.not.this.lo");
      list.add("is");
      list.add("a.b.c");
      list.add("sentence");
      System.out.println("list:" + list);

      ArrayList<String> splitList = splitArrayList(list, ". ");
      for (String s : splitList) {
      System.out.println(s+",");
      }

      
      // convert aerraylist in string using toString()************************
      // String a = list.toString();
      // System.out.println("convert aerraylist in string using toString(): " + a);

      // convert the arraylist into a string()********************
      // String arraylist = String.join(", ", list);
      // System.out.println("convert the arraylist into a string: " + arraylist);

      // split() string in string array****************
      // String[] s = a.split("/" );
      // System.out.println("split() string into string[]:" + Arrays.toString(s));

      // ArrayList<String> l = new ArrayList<>();
      // String s = list.toString();
      // System.out.println("string:  " + s);
      // char k = '.';
      // // String[] a=s.split("["+k+"]");
      // String[] a = s.split("k");
      // System.out.println("string arra:   " + Arrays.toString(a));

      // for (String b : a) {
      //    l.add(b);
      // }
      // System.out.println(l);

      // ArrayList<String> l = new ArrayList<>();
      // String[] splitStrings = list.get(0).split(".");
      // for (String string : splitStrings) {
      // l.add(string);
      // }
      // System.out.println(list);

   }

   public static ArrayList<String> splitArrayList(ArrayList<String> list, String d) {
      ArrayList<String> l = new ArrayList<>();
      // String s1 = String.valueOf(d);
      // System.out.println(s1);

      for (String s : list) {
          String[] a = s.split(d);
          // System.out.println(Arrays.toString(a));
          for (String s2 : a) {
              l.add(s2);
          }
      }
      return l;
   }

}
