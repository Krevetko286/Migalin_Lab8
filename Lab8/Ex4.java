package ru.mirea.gibo4.Lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {

    public static void main(String[] args)  {
        String filePath = "Recording.txt";
        String text = "\nI'm Evgeny";

        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

