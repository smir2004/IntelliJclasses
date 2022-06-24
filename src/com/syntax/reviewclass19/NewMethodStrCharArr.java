package com.syntax.reviewclass19;


public class NewMethodStrCharArr {
    private String str;//Best practice to always try to make all of your instance variable as private
        int number;
        // this.number; error as there is no instance variable number
       // this.str=str;


    //write a method that can tell me how many times as character is being
    //repeated in a string
    public  int countChars(char c){
        int counter=0;
        for(char cha:str.toCharArray()){
            if(cha==c){
                counter++;
            }
        }
        return counter;
    }
}
