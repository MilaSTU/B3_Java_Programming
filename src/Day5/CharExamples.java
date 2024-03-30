package Day5;

public class CharExamples {
    public static void main(String[] args) {

        //Declare and assign value to char data type variable

        char letterOne = 'a';
        char letterTwo = 'Z';
        char letterThree = '9';
        char letterFour = '%';
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);

        System.out.println(letterOne + letterTwo); // aZ ---> 97+ 90= 187
         char letter = 74; // J
        System.out.println(letter);
        //char letter2 = '75'; // this is invaid because single quote can only hold a single character

        System.out.println(letterOne + letterTwo + letterThree + letterFour);
        System.out.println(letterOne + " " + letterTwo + " " + letterFour);
        System.out.println(""+ letterOne + letterTwo + letterThree + letterFour);
    }
}
