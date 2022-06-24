package com.syntax.class21;

import javax.swing.*;

public class CreditCardTask2 {
     double interest;
     double balance;
    void calculateRate(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println("Interest rate is "+balance*(interest/100));
    }

}
class Visa extends CreditCardTask2{

}
class AX extends CreditCardTask2{
    void calculateRate(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println("Interest rate for your AX card is "+balance*(interest/100));
    }
    public static void main(String[] args){
        CreditCardTask2 creditcard=new CreditCardTask2();
        creditcard.calculateRate( 5000.69, 1.75);
    Visa visa=new Visa();
    visa.calculateRate(200.45, 1.35);

    AX ax=new AX();
    ax.calculateRate(64999, 1.98);
    }
}