//package JavaI.O.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    // public static void main(String[] args) throws IOException {
        
    //     //creating new file using throws Ioexception************

    //     File myFile2=new File("nextfile");
    //     myFile2.createNewFile();

    // }


    public static void main(String[] args) {

        //creating new file using try-catch method***********
        
        // File myfile=new File("filehandling");
        
        // try {
        //     myfile.createNewFile();
        // } catch (IOException e) {
        //   System.out.println("unable to create this file");

        //     e.printStackTrace();
        // }


        //code to write to a file**********
        // try  {
        //     FileWriter f = new FileWriter("filehandling");
        //     f.write("This is my first file using file handling in java /no ok bye");
        //     f.close();
        // } 
        // catch (IOException e) {
        //     e.printStackTrace();
        // }
        


        //Reading a file***********
        File myFile=new File("filehandling");
        try {
            Scanner sc=new Scanner(myFile);
             while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);

             }sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
