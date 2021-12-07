package com.company;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * The Main class.
 */
public class Main {
    /**
     * The main method
     * @param args the Main arguments
     * @throws IOException An exception that is thrown when an I/O error occurs
     */
    public static  void main(String[] args) throws IOException {

        FileReader file = new FileReader("C:\\Users\\Acer\\IdeaProjects\\Laba4\\foreign_names.csv");
        CSVReader reader = new CSVReader(file, ';');
        String[] nextStr;
        List<Person> prsn = new ArrayList();

        while ((nextStr = reader.readNext()) != null) {
            Random rndm = new Random();
            int num = rndm.nextInt(25000);
            prsn.add(new Person(nextStr[0], nextStr[1], nextStr[2], nextStr[5], nextStr[3], nextStr[4], num));

        }

        for (int i = 1; i < prsn.size(); i++)
            System.out.println(prsn.get(i));
    }
}
