//package com.syntax.class19;
//
//public class Teacher {
//    private String name;
//    /*
//Write a Java program called Teacher.
//  Identify features and behaviour of that Class.
//  Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
//   that would have it their own features and behaviour. Test all 4 classes
// */
//
//    public static void main(String[] args) {
//        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
//        chemistryTeacher.name="Adem";
//        chemistryTeacher.favoriteChemSubject="Organic";
//        chemistryTeacher.teacheChemistry();
//
//    }
//}
//
//class Teacher{
//    String name;
//    String typeOfTeacher;
//    public void teach(){
//        System.out.println(name+" Teaches "+typeOfTeacher);
//    }
//}
//class MathTeacher extends Teacher{
//    String favoriteMathSubject;
//    public void teachesMath(){
//        System.out.println(name+" Teaches Math and his favorite math subject is "+favoriteMathSubject);
//    }
//}
//class ChemistryTeacher extends Teacher{
//    String favoriteChemSubject;
//    public void teacheChemistry(){
//        String name;
//        System.out.println(name+" Teaches Chemistry and his favorite Chemistry subject is "+favoriteChemSubject);
//    }
//}
//
//class PianoTeacher extends Teacher{
//    String favoriteModelOfPiano;a
//    public void teachesPiano(){
//        boolean name;
//        System.out.println(name+" Teaches Piano and his favorite Piano Model is "+favoriteModelOfPiano);
//    }
//}
//
