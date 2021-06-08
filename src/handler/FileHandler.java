package handler;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void writeFile(String file_name, ArrayList<String> lines) {
        criarFile(file_name);
        try {
            FileWriter myWriter = new FileWriter("Banco/" + file_name + ".txt");
            for (int i = 0; i < lines.size(); i++) {
                myWriter.write(lines.get(i));
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static ArrayList<String> readFile(String file_name) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            File file = new File("Banco/" + file_name + ".txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
            reader.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }
}