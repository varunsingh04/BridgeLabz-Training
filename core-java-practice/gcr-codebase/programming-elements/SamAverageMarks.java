
//Class to calculate average marks of sam in PCM
public class SamAverageMarks {
    public static void main(String[] args) {
        //Declare a variable to store marks obtained by sam in Math
        int mathMarks = 94;
        //Declare a variable to store marks obtained by sam in Physics
        int physicsMarks = 95;
        //Declare a variable to store marks obtained by sam in Chemistry
        int chemistryMarks = 96;

        //Declare a variable totalMarks to store total marks obtained by sam in PCM
        int totalMarks = mathMarks + physicsMarks + chemistryMarks;

        //Declare a variable averageMarks to store average marks of sam in PCM
        int averageMarks = totalMarks / 3;

        //Display average marks of sam in PCM
        System.out.println("Sam’s average mark in PCM is ___ " + averageMarks);
                        
    }
}
