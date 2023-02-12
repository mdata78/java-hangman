package pl.edu.agh.hangman;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordDrawing {

    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
        File plik = new File("src/main/resources/slowa.txt");

        Scanner myReader = new Scanner(plik);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }
}


