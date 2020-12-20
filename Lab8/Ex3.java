package ru.mirea.gibo4.Lab8;

import java.io.IOException;
import java.nio.charset.*;
import java.nio.file.*;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        String fileName = "Recording.txt";
        String search = "Hello";
        String replace = "Hi";
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(fileName);
        Files.write(path,
                new String(Files.readAllBytes(path), charset).replace(search, replace)
                        .getBytes(charset));
    }
}
