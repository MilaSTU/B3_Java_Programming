package Day4_variables;

public class FortuneTeller {
    public static void main(String[] args) {
/* Create a class called FortuneTeller in your Practice_Programming project and inside the day04_tasks package

        Task:

            STORE THE FOLLOWING INTO VARIABLES:
                NUMBER OF CHILDREN,
                PARTNER'S NAME,
                GEOGRAPHIC LOCATION,
                JOB TITLE

            OUTPUT YOUR FORTUNE TO THE SCREEN LIKE SO:
            "YOU WILL BE A X IN Y, AND MARRIED TO Z WITH N KIDS."

                X –JOB TITLE
                Y –LOCATION
                Z –PARTNER’S NAME
                N -# OF KIDS

 */
        int  numberOfChildren;
        numberOfChildren = 4;
        String partnerName;
        partnerName = "Rita";
        String geographicLocation;
        geographicLocation = "Italy";
        String jobTitle;
        jobTitle = "Cosmetologist";



        System.out.println("You will be " + jobTitle + " in " + geographicLocation + " and married to " + partnerName + " with " + numberOfChildren + ".");
    }
}
