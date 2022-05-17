package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        int cruz;
        try (FileInputStream Ts=new FileInputStream("test123.txt");FileOutputStream fot = new FileOutputStream("newtest.txt")){
            do {
                cruz = Ts.read();//read from user
                if ((char)cruz==' '){
                    cruz='-';
                }
                if (        cruz!= -1) {

                    fot.write(cruz);
                }
            }
            while (cruz != -1);
            System.out.println("Successfully copied");
        }
        catch (FileNotFoundException e) {e.printStackTrace();}

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}