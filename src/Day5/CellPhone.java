package Day5;

import org.w3c.dom.html.HTMLAppletElement;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "Iphone 14 Pro";
        String color = "Red";
        double price = 799.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " +  model + " from " +  brand);
        System.out.println(" It came in the " + color + " and it has " + storage + "GB");
        System.out.println("For the sim type " + sim + " with a camera: " + hasCamera + ", the total price is " + price);

        //String fullMessage = "I have an " + model + " from " + brand + ".\n  It came in the " + $color and it has $storage GB. " +
               // "For the sim type $sim with camer: $camera and the price is $price."
    }
}
