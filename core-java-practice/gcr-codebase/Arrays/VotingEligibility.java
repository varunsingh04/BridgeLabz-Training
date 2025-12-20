package Arrays;

import java.util.*;

public class VotingEligibility {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] ageArray = new int[10];
		
		for(int i = 0 ; i < ageArray.length; i++) {
			ageArray[i] = input.nextInt();
		}
		
		isEligible(ageArray);
		
	}
	
	public static void isEligible(int[] ageArray) {
		int age = 0;
		
		for(int i = 0; i < ageArray.length; i++) {
			age = ageArray[i];
			if(age < 0 ) {
				System.out.println("invalid age");
			} else if(age >= 18) {
				System.out.println("The student with the age " + age + " can vote.");
			}else {
				System.out.println("The student with the age " + age + " cannot vote");
			}
		}
	}
}
