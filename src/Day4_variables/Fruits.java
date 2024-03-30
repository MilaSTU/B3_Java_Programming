package Day4_variables;

public class Fruits {
    public static void main(String[] args) {
         int apples = 50;
         int grapes = 100;
         int bananas = 150;

        System.out.println("This is how many apples we have:" +70);// the value 70 is hardcoded
        System.out.println("This is how many apple we have:" + apples);// the value of apples is Dynamically used
        System.out.println(50 + 50);
        //NOTE: Anything after FIRST String is CONCATENATION
        System.out.println("50" + 50);


        System.out.println("Grapes: " + grapes);
        System.out.println("Banana: " + bananas);

        //REASSIGNMENT
        System.out.println("Sold out some of apples");
        apples = 30;
        System.out.println("Apples after selling: " + apples);

        int price = 15; // Having datatype not hardcoded variables make easy to reassign the value
        System.out.println("The price of my 30 apples is $15"); //IT IS HARDCODED
        System.out.println("The price of my " + apples + " apples is $" + price);


    }
}
