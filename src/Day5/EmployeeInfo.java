package Day5;

import java.sql.SQLOutput;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName,lastName,company,jobTitle,gender,PTO;
        char F;
        int salary = 120_000_00;
        int age;
        boolean isMarried = true;
        boolean isFullTime = false;

        firstName = "Mila";
        lastName = "Stuhlmiller";
        company = "NATO";
        jobTitle = "SDET";
        PTO = "Full paid 20 days";
        gender = "F";


        String fullDetail = "Employment Information for James Bond: \nFirst Name: " + firstName + "\nLast name: "
                + lastName + "\nGender: " + gender + "\nMarried: " + isMarried + "\nFull time: " + isFullTime +
                "\nCompany: " + company + "\nJob Title: " + jobTitle + "\nPTO: " + PTO + "\nSalary: " + salary;
        System.out.println(fullDetail);

        // As long as the variables share their data type,
        // we can declare them in the same line using coma.





    }
}
