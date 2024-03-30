package Day4_variables;

public class FloatingNumbers {
    public static void main(String[] args) {
        // in java you can't store fractions. ----> 3/4
        System.out.println(3/4); // 0.75

        // how we store decimal numbers 4.5 or 5.99
        double price = 3.99; // This is the one used for Decimal number almost always

        float average = 0.19F;
        System.out.println(price); // data type is: Double
        System.out.println(average); // data type is: Float
        System.out.println(4.15); // here by default the data type is: Double
    }
}
