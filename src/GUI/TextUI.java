package GUI;

import Data.Months;

import java.util.Scanner;

public class TextUI {


    public int userIntInput(){
        int userInput;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            userInput = stringToInt(scanner.nextLine());
            if(userInput < 0){
                messageToUser("Invalid tal, prøv venligst igen.");
            } else {return userInput;}
        }
    }

    public String userStringInput(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public String userStringInputMonth(){
        String userInput;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();
            if(!Months.months.containsKey(userInput.toUpperCase())){
                messageToUser("Invalid måned, prøv venligst igen.");
            } else {return userInput;}
        }
    }

    public void messageToUser(String message){
        System.out.println(message);
    }

    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int stringToInt(String string){

        int integer = -1;

        try {
            integer = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            integer = integer;
        }
        return integer;
    }

}
