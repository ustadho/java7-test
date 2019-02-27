package com.mitrais.training.j7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try(FileInputStream inputStream= new FileInputStream("testing.txt")){
            int c =-1;
            System.out.println();
            System.out.println("******** Try with Resource in JDK 7 ******");
            while ((c=inputStream.read()) !=-1 ){
                System.out.println(((char)c));
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
