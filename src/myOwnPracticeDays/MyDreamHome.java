package myOwnPracticeDays;

public class MyDreamHome {
    public static void main(String[] args) {

        String twoLevelHouse,address;
        int zipCode,houseNumber;
        double schoolRating;
        byte bedrooms,bathrooms,kitchen;
        boolean outdoorKitchen,pool,tennisCourt,basement;

        twoLevelHouse = "two levels";
        address = "HopTree Branch";
        houseNumber = 37;
        zipCode = 54321;
        schoolRating = 4.5;
        bedrooms = 5;
        bathrooms = 4;
        kitchen = 1;
        outdoorKitchen = true;
        pool = true;
        tennisCourt = false;
        basement = false;

        String HouseFullInfo = "This beautiful house has: " + twoLevelHouse + "\nBedroom: " + bedrooms +
                "\nBathroom: " + bathrooms + "\nKitchen: " + kitchen + "\nPool: " + pool + "\nOutdoor Kitchen: "
        + outdoorKitchen + "\nTennis Court: " + tennisCourt + "\nBasement: " + basement + "\nLocated: " + address +
                "\nZip Code: " + zipCode + "\nThe school Rating is: " + schoolRating;
        System.out.println(HouseFullInfo);



        String firstName;
        firstName = "Noah";
        String lastName;
        lastName = "Smith";
        String companyName;
        companyName = "Apple";
        int salary;
        salary = 200_000;
        int startDay;
        startDay = 10;
        byte startMonth;
        startMonth = 1;
        int startYear;
        startYear = 2022;
        boolean fullTime = true;
        String jobTitle = "SDET";
        String officeAddress = "One Apple Park Way, Cupertino, CA 95014";

        String FULL_NAME = "Noah Smith";
        String FIRST_NAME = "Noah";
        String COMPANY_NAME = "Apple";
        String FULL_START_DATE =  "1/10/2022";
        String EMAIL = "Noah10@Apple.com";
        String $SALARY = "$200000";
        String $SALARY_2_YEARS = "$230000";
        String ADDRESS = "One Apple Park Way, Cupertino, CA 95014";
        boolean IS_FULL_TIME;
        IS_FULL_TIME = true;

        System.out.println("Employee Information");
        System.out.println("We have " + FULL_NAME + " joining " + COMPANY_NAME);
        System.out.println(FIRST_NAME + " will start on " + FULL_START_DATE + " as full time: " + IS_FULL_TIME);
        System.out.println(FIRST_NAME + " here is some information about your employment ");
        System.out.println("Your email is " + EMAIL);
        System.out.println("Your base salary is " + $SALARY + " and after 2 years it will be " + $SALARY_2_YEARS);
        System.out.println("Welcome aboard, see you at " + ADDRESS);

    }
}






