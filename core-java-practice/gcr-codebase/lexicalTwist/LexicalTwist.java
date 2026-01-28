package lexicalTwist;

import java.util.*;


public class LexicalTwist {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Word");
		String word1 = input.nextLine();
		//Condition to check only one word take as input
		if (word1.trim().contains(" ")) {
            System.out.println(word1 + " is an invalid word");
            return; 
        }
		System.out.println("Enter Second Word");
		String word2 = input.nextLine();
		// Condition to check only one word take as input
		if (word2.trim().contains(" ")) {
            System.out.println(word2 + " is an invalid word");
            return;
		}
		
		
		String vowels = "aeiouAEIOU";
		
		if(isReverse(word1,word2) == true) { //case1 when second word is reverse of first word 
			word1 = word1.toLowerCase();
			reverse(word1);
			StringBuilder outputWord = new StringBuilder();
			for (char ch : word1.toCharArray()) {
	            if (vowels.indexOf(ch) != -1) {
	                outputWord.append('@');
	            } else {
	                outputWord.append(ch);
	            }
	        }
			System.out.println(outputWord);
		}else { // case 2 when is not reverse of first word 
			String combined = word1 + word2;
			combined.toUpperCase();
			if(countVowel(combined) > countConsonants(combined)) {  //if vowel > consonatsn print first 2 unique vowels 
				LinkedHashSet<Character> uniqueVowels= new LinkedHashSet<>();
				for (char ch : combined.toCharArray()) {
	                if (vowels.indexOf(ch) != -1) {
	                    uniqueVowels.add(ch);
	                }
	            }
				int printed = 0 ;
				for(char c : uniqueVowels) {
					System.out.print(c);
					printed++;
					if(printed == 2) break;
				}
			}else if(countVowel(combined) < countConsonants(combined)) { // if vowels < consonants print first 2 unique consonants  
					LinkedHashSet<Character> uniqueConsonants = new LinkedHashSet<>();
					for(char ch : combined.toCharArray()) {
						if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
		                    uniqueConsonants.add(ch);
		                }
					}
					int printed = 0 ;
					for(char c : uniqueConsonants) {
						System.out.print(c);
						printed++;
						if(printed == 2) break;
					}
					
			}else { // if vowels and consonants are both equal
				System.out.println("Vowels and consonants are equal");
			}
			
		}
	}
	
	
	// Methof to check is second is reverse of first word
	static boolean isReverse(String str1, String str2) {
		String word1Reverse = reverse(str1);
		if(word1Reverse.equals(str2)) return true;
		return false;
	}
	
	
	
	// method to reverse the word
	static String reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
	     return sb.reverse().toString();
	}
	
	
	// method to count the occurence of vowel
	static int countVowel(String str) {
		
		int count = 0;
		str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E'
                || str.charAt(i) == 'I'
                || str.charAt(i) == 'O'
                || str.charAt(i) == 'U') {
                count++;
            }
        }
        
        return count;
	}
	
	
	//method to count the occurence of consonants
	static int countConsonants(String str) {
		 int count = 0;
	     str = str.toUpperCase();
	     for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'A' && ch <= 'Z') {
	                if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
	                    count++;
	                }
	            }
	        }
	     return count;
	}

}
