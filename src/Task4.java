package com.company;

import java.io.*;

class DataManagement{
    String cruz56329 ;
    void ReadDatacruz56329() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Please Input Your Full Name");
        UzielCruz56329=tv.readLine();
    }
    void WriteDataTocruz56329File(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(UzielCruz56329);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void readDataViacruz56329File(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("task4.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataViacruz56329File();
        obj.WriteDataTocruz56329File();
        System.out.println();
        obj.ReadDatacruz56329();
    }

}
