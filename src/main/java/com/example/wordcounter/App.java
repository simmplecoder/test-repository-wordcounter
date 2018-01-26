package com.example.wordcounter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
        String replaced = text.replaceAll("--", " ");
        return replaced.split("\\s+").length;
    }
}
