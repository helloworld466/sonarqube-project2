package com.mycompany.helloworld1;

public class HelloWorld {
    private String hello; 
    private String world;         
   
    HelloWorld(){  
        hello = "Hello";
        world = "World";
    } 
       
    public String fromMessage(){ 
        String message;  
        message = hello + " " + world;
        return message; 
    } 
    
    public static void main(String[] args) {  
        HelloWorld helloWorld = new HelloWorld();  
        System.out.println(helloWorld.fromMessage()); 
    }
}
