package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

       // ArrayList<PersonInformation> myList = readDataFromFile("data/persons.txt");

        Scanner input = new Scanner(System.in);


        ArrayList<PersonInformation> myList = new ArrayList<>();

        while (true) {
            PersonInformation person = new PersonInformation();

            System.out.println("Enter your name");
            String name = input.nextLine();
            if ("end".equalsIgnoreCase(name)) {
                break;
            }
            person.setName(name);

            System.out.println("Enter your eMail");
            String eMail = input.nextLine();
            person.seteMail(eMail);

            System.out.println("Enter your favorite color");
            String favColor = input.nextLine();
            person.setFavColor(favColor);

            System.out.println("Enter your age");
            int age = input.nextInt();
            person.setAge(age);

            myList.add(person);


        }

        for (PersonInformation item : myList) {
            System.out.println(item.getName() + "  " + item.geteMail() + "  " + item.getFavColor() + "  " + item.getAge());
        }

        System.out.println("\n");
        while (true) {
            System.out.println("Enter color:");
            String selectedColor = input.nextLine();

            if ("end".equalsIgnoreCase(selectedColor)) break;

            System.out.println(ColorFeedback.getFeedback());

            for (PersonInformation item : myList) {
                if (selectedColor.equalsIgnoreCase(item.getFavColor())) {
                    System.out.println(item.getName() + "  " + item.geteMail() + "  " + item.getFavColor() + "  " + item.getAge());
                }
            }

        }


    }

    /*public static ArrayList<PersonInformation> readDataFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scannerInput = new Scanner(file);

        ArrayList<PersonInformation> myList = new ArrayList<>();
        while (scannerInput.hasNextLine()) {
            String line = scannerInput.nextLine();
            String[] values = line.split(" ");

            PersonInformation person = new PersonInformation();
            person.setName(values[0]);
            person.seteMail(values[1]);
            person.setFavColor(values[2]);

            myList.add(person);
        }
        return myList;
    }*/
}
