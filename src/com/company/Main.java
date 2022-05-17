package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fis;
        int cruz;
        try{
            fis=new FileInputStream("test123.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }



        //read bytes until EOF encountered
        try{
            do{
                cruz=fis.read();//read from file
                if (cruz!= -1){System.out.print((char)bat);}
            }
            while(cruz!= -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }
        finally {
            try{
                fis.close();
                System.out.println("File Closed");
            }
            catch (IOException e) {
                System.out.println("Error Closing ile");
            }
        }



    }
}
