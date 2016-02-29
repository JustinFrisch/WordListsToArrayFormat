package practiceprograms;
import java.util.Scanner;
import java.util.Arrays;
public class WordstoStringFormat {
	
		 public static void main(String[] args)
		 {
		      System.out.println("Please first input the amount of words you have to be formatted.");

		      Scanner scan = new Scanner(System.in);
		 
		 int listNumber = scan.nextInt();     
		 
		 String[] wordList = new String[listNumber];
		 
		 int length = wordList.length;
		
		 System.out.println("Now enter the list of words by copying and pasting the list, make sure that each word is on a seperate line.");
		 System.out.println("Also be sure that each row only contains a single word");
		 System.out.println("For example, if you copy and paste a list of words in an excel column it will format correctly");
		 
		 //This will turn your word list into an array.
		 
		 wordList[0] = scan.nextLine();
		 
		for(int i=0; i < length;i++){
			String input = scan.nextLine();
			wordList[i] = input;
		}
		
		for(int i = 0; i < length; i++){
		 	
		 }		 
		
		//this takes that array and formats it into a string array ready to go
	String takeWordList = Arrays.toString(wordList);
	String withBrackets = takeWordList.replace("[", "{1").replace("]","1}").replace(",", "23").replace('1', '"').replace('2','"').replace('3', ',').replace(' ', '"');
		System.out.println(withBrackets);
		
		 }	 
}		 
		 
		 
		 
		 
		 
		 
		
	
	

