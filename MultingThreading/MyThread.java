///creation of runnale interface in multithreading*******************

 class MyThread  implements Runnable{

    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("the value is "+i);

            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }

    public static void main(String[] args) {
        //creat obj for mythread
        MyThread t=new MyThread();
        Thread s=new Thread(t);
        s.start();


    //Mythread2 craete obj
    MyThread2 t2 =new MyThread2();
    t2.start();
        
    }
}

//creation of thread interface in multithreading*********************
class MyThread2 extends Thread{

    public void run(){
        for(int i=10;i>0;i--){
            System.out.println("vlue is "+i);
            // using sleep method of sleep some time of opration
            try{   
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }

    }
    // public static void main(String[] args) {
    //     //creat obj
    //     MyThread2 t2=new MyThread2();
    //     t2.start();
    // }

}
