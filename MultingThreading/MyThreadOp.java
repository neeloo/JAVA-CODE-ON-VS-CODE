public class MyThreadOp {
    public static void main(String[] args) {
        System.out.println("start the program!!!");
        int a=10+2;
        System.out.println(a);

        //current thread name 
        Thread t=Thread.currentThread();
        System.out.println( "current thread name is "+t.getName());   //use of getName()

        //set the name of thread
        t.setName("Mynewthread");
        System.out.println("change thread name id "+t.getName());

        //sleep of thread
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            
        }

        System.out.println("End the program!!!");
    }
}
