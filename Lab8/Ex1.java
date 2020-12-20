package ru.mirea.gibo4.Lab8;

import java.io.*;

public class Ex1 {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("Recording.txt", false))
        {
            // запись всей строки
            String text = "Hello";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
