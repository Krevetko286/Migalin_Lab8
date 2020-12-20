package ru.mirea.gibo4.Lab8;

import java.io.*;

public class Ex2 {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("Recording.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
