package test;

public class CountWords {
	   public static void main(String argu[]) {
		      String input_string = "Java Programming";
		      System.out.println("The string is defined as: " + input_string);
		      char[] character_array = input_string.toCharArray();
		      System.out.print("The duplicate characters in the string are: ");
		      for (int i = 0; i < input_string.length(); i++) {
		         for (int j = i + 1; j < input_string.length(); j++) {
		            if (character_array[i] == character_array[j]) {
		               System.out.print(character_array[j] + " ");
		               break;
		            }
		         }
		      }
		   }
		}