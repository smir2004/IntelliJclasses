package com.syntax.class21;

public class DegreeTask1 {
    void getPrerequisites(){
        System.out.println("to get a degree you need high schooll diploma");
    }
}
class Bachelors extends DegreeTask1{

}
class Masters extends DegreeTask1{
    void getPrerequisites(){
        System.out.println("to get a Masters degree you need a bachlors degree");
    }
    public static void main(String[] args){
        DegreeTask1 degree=new DegreeTask1();
        degree.getPrerequisites();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisites();
        Masters masters=new Masters();
        masters.getPrerequisites();
    }

}