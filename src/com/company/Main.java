package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        String quit = " ";
        ArrayList<PersonInformation> myList = new ArrayList<>();


        while (!quit.equalsIgnoreCase("end")) {
            PersonInformation person = new PersonInformation();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("end")) {
                break;
            } else {
                person.setName(name);
                System.out.println("Enter your eMail");
                String eMail = input.nextLine();
                person.seteMail(eMail);
                System.out.println("Enter your favorite color");
                String favColor = input.nextLine();
                if (favColor.equalsIgnoreCase("grey")){

                  //  System.out.println(favColor + " OK");
                }
                else if (favColor.equalsIgnoreCase("blue")) {

                   // System.out.println(favColor + " That's a nice color!");
                }
                else if (favColor.equalsIgnoreCase("red")) {
                   // System.out.println(favColor + " It pops");
                }
                person.setFavColor(favColor);
                System.out.println("Enter your age");
                int age = input.nextInt();
                person.setAge(age);


                myList.add(person);


            }
        }

        for (PersonInformation item : myList) {


            System.out.println(item.getName() + "  " + item.geteMail() + "  " + item.getFavColor() + "  " + item.getAge());


        }


        // write your code here
    }
}
