package day02_print_statements;

import java.sql.SQLOutput;

public class Quotes {
    public static void main (String [] args){
 /*
 Q: I want to print I like "java" programming.
  */
        System.out.println("I like \"Java\" programming.");
        System.out.println("\" This is double quote\"");
        /*
        Q: How about if i want to print on/off ?
         */
        System.out.println("I want to turn it on\\off");
        // the first backward slash is for the syntax.
        //the second backward slash is for the text to be print it out.
        /*
        Q: How about if i want to print double backward slash
         */
        System.out.println("\"I want to turn it on\\\\off");
        System.out.println("The password can be true/false!");
        // For forward slash we dont nee any escape sequence.

    }
}
