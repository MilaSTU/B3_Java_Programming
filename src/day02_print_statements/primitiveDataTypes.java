package day02_print_statements;

import java.sql.SQLOutput;

/*import javax.xml.crypto.Data;

Data types:
Primitive    -  total 8
integer types:  byte - short -int - long
Floating types: Float - double
Character:      char
True/False:      Boolean
Non-Primitive
     String:     Multi characters
*/
public class primitiveDataTypes {
    public static void main (String[] args){

        byte age = 60;
        System.out.println(age); // datatype here is byte
        System.out.println(60); // datatype here is int by default

        short year; // i have declared a variable called year which has datatype short
        year = 2024; // assigned the value, 2024, into my variable called year
        System.out.println(year);

        int addressNumber = 244432;
        System.out.println(addressNumber); // Datatype here is int

        long bigNumber;
        bigNumber = 19876544332211L;
        System.out.println(bigNumber);


    }
}
