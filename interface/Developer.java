import java.util.Scanner;

interface Client {
    void input();

    void output();
}


class Developer implements Client {
    String name;
    double salary;

    @Override
    public void input() {

        Scanner sc = new Scanner(System.in);


        System.out.println("enter name:" );
        name = sc.nextLine();
      
        System.out.println("enter salary:" );
        salary = sc.nextDouble();
       
        
    }

    @Override
    public void output() {
        System.out.println("name is:"+name + " " +" & salary is:"+ salary);
    }

    public static void main(String[] args) {
        Client c = new Developer();
        c.input();
        c.output();

    }

}
