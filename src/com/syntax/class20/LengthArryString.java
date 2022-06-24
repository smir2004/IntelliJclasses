package com.syntax.class20;

public class LengthArryString {
    public static void main(String[] args) {
        String str = "Is it Saturday? Is it raining? Do we have a Jva Class today?";
        //System.out.println(str.split("[?]").length);
        String[] array = str.split("[?]");
        System.out.println(array.length);
        System.out.println(str.split("[?]").length);

        String str1 = "sdfggfdl12445#$&^&";
        System.out.println(str1.replaceAll("[^A-Za-z)-9]", "").length());
    }
}