package FlipKeyLogicalProblem;


import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Program obj = new Program();
		System.out.println("Enter the Word");
		String word = sc.next();
		if(obj.ClenseAndInvert(word).equals(" ")) {
			System.out.println("Invalid Input");
		}else {
			System.out.println("The generated key is - " + obj.ClenseAndInvert(word));
		}
	}
	
	public String ClenseAndInvert(String input) {
		
		
		if(input.isEmpty() || input.length() < 6) {
			return " ";
		}
		if(!input.matches("^[A-Za-z]+$")) {
			return " ";
		}
		
		
		
		StringBuilder newInput = new StringBuilder();
		
		
		input = input.toLowerCase();
		
		for(int i= 0; i < input.length(); i++) {
			int asciiValues = input.charAt(i);
			if(isOdd(asciiValues)) {
				newInput.append((char) asciiValues);
			}
		}
		
		
		newInput = newInput.reverse();
		
		
		for(int i = 0 ; i < newInput.length(); i++) {
			if(i%2==0) {
				char c = newInput.charAt(i);
				newInput.setCharAt(i, Character.toUpperCase(c));
			}
			
			
		}
		
		
		return newInput.toString();
		
		
	
	
	}
	
	public boolean isOdd(int values) {
		if(values % 2 != 0) {
			return true;
		}
		return false;
	}
	
	
}
