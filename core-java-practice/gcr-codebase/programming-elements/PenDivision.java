//Declare a class to calulate pen division
public class PenDivision {
    public static void main(String[] args) {
        //Declare a variable to store total number of pens
        int totalPens = 14;

        //Declare a variable to stor number of students
        int numberOfStudents = 3;
        
        //Declare a variable to calculate pen per student 
        int pensPerStudent = totalPens / numberOfStudents;

        //Declare a variable to calculate remaining pens
        int remainingPens = totalPens % numberOfStudents;

        //Display the result
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                    " and the remaining pen not distributed is " + remainingPens
        );
    }
}
