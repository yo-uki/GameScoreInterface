package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // testing here


    }



    public static void savedObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+ " to storage device");
        }

    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String > values = readValues();
        objectToLoad.read(values);
    }


    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner skaner = new Scanner(System.in);
        boolean quit = false;
        int index= 0;

        System.out.println("1- enter a string\n" +
                "0- quit");

        while (!quit){
            System.out.println("choose option:");
            int choice = skaner.nextInt();
            skaner.nextLine();

            switch (choice){
                case 0: quit=true;
                break;
                case 1:
                    System.out.println("Enter a string:");
                    String inputS = skaner.nextLine();
                    values.add(index, inputS);
                    index++;
                    break;
            }
        }
        return values;
    }
















}
