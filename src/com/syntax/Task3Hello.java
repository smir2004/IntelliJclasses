package com.syntax;

public class Task3Hello {
    void sayHello(String country) {

        String hello;
        switch (country) {
            case "USA":
                hello = "Hola";
                break;
            case "Russia":
                hello = "Privet";
                break;
            case "France":
                hello="bonjour";
                break;
            case "Pakistan":
                hello="Assalam o Alykum";
                break;
            case "India":
                hello="Namastay";
                break;
            case "Turkiye":
                hello="Merhaba";
                break;
            default:
                hello="Country not found";
        }
        System.out.println(hello);
    }
    public static void main(String[] args){
        Task3Hello task3=new Task3Hello();
        task3.sayHello("India");
    }
}
