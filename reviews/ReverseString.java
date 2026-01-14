package reviews;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = reverseString(sentence);
        System.out.println(reversed);
    }

    public static String reverseString(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            result.append(sb).append(" ");
        }
        return result.toString().trim();
    }
}
