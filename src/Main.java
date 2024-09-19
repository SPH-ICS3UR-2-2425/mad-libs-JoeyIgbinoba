import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to ArcadSpeach");
		System.out.println("It's a off brand version of Mad Libs.");
		System.out.println(":)");
/*		System.out.println("True or false? Pick...");
		Boolen Yesorno = in.nextLine();
	    if (Yesorno = true); {
			System.out.println("Hello, can you please respond...");
			String statementl = in.nextLine();
			System.out.println("Is that all you can say to me" +statementl+ ".");
						System.out.println("Well, then see yea");
	    } 
*/
		System.out.println("Enter your name?");
		String Pname = in.nextLine();
		System.out.println("Hmmm, that seems incorrect. Try again, " +Pname+ ".");
		System.out.println("I have some questions for you please complete them.");
		
		System.out.println("What animal pops into you head? When you think of the word flight.");
		String animal = in.nextLine();
		System.out.println("Give me a name please");
		String Aname = in.nextLine();
		System.out.println("Give me noun.");
		String bookNouns = in.nextLine();
		System.out.println("Give me a another noun?");
		String bookNoun = in.nextLine();
		System.out.println("Give me a adverb");
		String bookAdverb = in.nextLine();
		System.out.println("Hey are you bored?");
		System.out.println("Well now you know how I fell day in and day out."); 		
		System.out.println("Well back to the personal questions.");
		System.out.println("What is mother maiden name?");
		String Mname = in.nextLine();
		System.out.println("I am just asking it for the fun of it.");
		System.out.println("Time to continue.");
		System.out.println("When you think of letters Ste what name comes to mind?");
		String hunterN = in.nextLine(); 
		System.out.println("What is your favorite terrain?");
		String terrain = in.nextLine();
		System.out.println("Name a home cooked meal?");
		String foodname = in.nextLine();
		System.out.println("When you think of the word orange. What fruit pops into your head.");
		String fruit = in.nextLine();
		System.out.println("Give me me a place, any place?");
		String landname = in.nextLine();
		System.out.println("Do you like yogurt");
		System.out.println("Do you have any?");
		System.out.println("Wait no, I have work to do....");
		
		
		

		System.out.println("Have you thought of one yet?");
		System.out.println("What was it?");
		System.out.println("Welcome to the land of " +landname+ "nias.");
		System.out.println(Aname+" the " +animal+ "is being hunted by the" +hunterN+ " the Hunter of Those in the " +terrain+".");
		System.out.println("Too, bad you cant, save them.");
		System.out.println("What is that in the sky?");
		System.out.println("Is  that an" +animal+ "?" );
		System.out.println("Wait no, its the" +Pname+ " of the " +terrain+ "and the Sky");
		System.out.println("During this time Jack the hunter teaches chases the creatures and reads the book called " +bookAdverb+ " and "+bookNoun+ "  of" +bookNouns+ ".");
		System.out.println("This " +animal+ "is being hunted by a creature that walks what is it, right?");

	}

}
