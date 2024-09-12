

abstract class Animal{
    abstract void  eat();
}

 class Dog extends Animal{
   public void eat(){
       System.out.println("eating meet");
   }
}

class Goat extends Animal{
   public void eat(){
       System.out.println("eating grass");
   }
}


class Test {
   public static void main(String[] args) {
       Dog a=new Dog();
       Goat g=new Goat();
       g.eat();
       a.eat();
   }
   
}



