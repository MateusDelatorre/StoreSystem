package handler;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

import Classes.Produto;

public class FileHandler {
    
    private void criarFile(String file_name) {
        try {
            File myObj = new File("Banco/" + file_name + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeFile(String file_name) {
        criarFile(file_name);
        try {
            FileWriter myWriter = new FileWriter("Banco/" + file_name + ".txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void readFile(String file_name) {
        try {
            File myObj = new File("Banco/" + file_name + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}