package Day4_variables;

public class School {
    public static void main(String[] args) {
        int numberOfStudentInGradeOne = 40;
        int numberOfStudentInGradeTwo = 30;
        int numberOfStudentInGradeThree = 60;
        int numberOfStudentInGradeFour = 20;
        int numberOfStudentInGradeFive = 25;

        //int totalNumberOfStudents = 40 + 30 + 60 + 20 + 25; //175
        //System.out.println(totalNumberOfStudents);
        // other way to calculate

        int totalNumberOfStudents = numberOfStudentInGradeOne+numberOfStudentInGradeTwo+numberOfStudentInGradeThree+numberOfStudentInGradeFour+numberOfStudentInGradeFive;
        System.out.println(totalNumberOfStudents);

        double numberSchoolDays = 100.5;
        double numberOfSnowDays = 5.5;
        double averageGpaInSchool = 3.6;

        System.out.println("Number of student in Grade 1: " + numberOfStudentInGradeOne);
        System.out.println("Number of student in Grade 2: " + numberOfStudentInGradeTwo);
        System.out.println("Number of student in Grade 3: " + numberOfStudentInGradeThree );
        System.out.println("Number of student in Grade 4: " + numberOfStudentInGradeFour);
        System.out.println("Number of student in Grade 5: " + numberOfStudentInGradeFive);

        System.out.println("Total number of students: " + totalNumberOfStudents);

        System.out.println("NUmber of school days " + numberSchoolDays);
        System.out.println("Number of snow days " + numberOfSnowDays);
        System.out.println("Average GPA in school " + averageGpaInSchool);


    }
}
