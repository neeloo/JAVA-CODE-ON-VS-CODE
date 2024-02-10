import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        //queue***********
    //   Queue<Integer>q = new LiskedList<>();
    //   q.offer(90);
    //   q.offer(80);
    //   q.offer(70);
    //   q.offer(60);
    //   System.out.println(q);
    //   System.out.println(q.remove());


    //ArrayDeque***********
    Deque<Integer>d=new ArrayDeque<>();
    d.offer(100);
    d.offer(200);
    d.offer(300);
    d.offer(400);
    System.out.println(d);
    d.offerFirst(900);
    d.offerLast(800);
    System.out.println(d);
    d.poll();
    System.out.println("ArrayDeque="+d);

//PriorityQueue***********(in java it is minheap) //unorderd 
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    pq.offer(200);
    pq.offer(300);
    pq.offer(600);
    pq.offer(800);
    System.out.println( "priorityQueue="+pq);
    pq.poll();
    System.out.println(pq); //second min value

    //Max heap in java using comparater.reverseorder()
    PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
    p.offer(12);
    p.offer(34);
    p.offer(67);
    System.out.println(p);
    p.poll();
    System.out.println(p); //second heightst value



    }
}
