package Day5;

public class RecapVariables {
    public static void main(String[] args) {


        /*
        hello1@ - NO cant have special characters other that $ _ digit
        12test -  NO cant start with digit
        $public - YES we can start with $
        _34hello - YES we can start with $
         */
        byte numberOfCoffeeCups = 10;
        double totalPriceCoffee = 10.25;
        int totalNumberOfStudentsInClass = 100;

        System.out.println(totalPriceCoffee);
        System.out.println(numberOfCoffeeCups);
        System.out.println(totalNumberOfStudentsInClass);

        double temperature = 30.5;
        int javaDay = 5;
        System.out.println("Today the temperature was " + temperature);
        System.out.println("it is Day " + javaDay + " in Java class.");


    }
}
