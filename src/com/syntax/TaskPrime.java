package com.syntax;

import org.w3c.dom.ls.LSOutput;

public class TaskPrime {
    boolean isPrime(int x){
        boolean isPrime=true;
        if(x>1) {

            for(int i=2;i<x;i++) {
                if(x%i==0) {  // if the number that user has provided if that number is completely divisable by any other number
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        return isPrime;
    }
    public static void main(String[] args) {
    TaskPrime task=new TaskPrime();

        System.out.println(task.isPrime(5));
    }



}
