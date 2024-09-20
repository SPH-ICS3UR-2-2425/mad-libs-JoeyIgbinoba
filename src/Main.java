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
		System.out.println("I have some questions for you, please complete them.");
		
		System.out.println("What animal pops into your head? When you think of the word flight.");
		String animal = in.nextLine();
		System.out.println("Give me a name please");
		String Aname = in.nextLine();
		System.out.println("Give me noun.");
		String bookNouns = in.nextLine();
		System.out.println("Give me an event?");
		String event = in.nextLine();
		System.out.println("Give me a color?");
		String color = in.nextLine();
		System.out.println("Give me a another noun?");
		String bookNoun = in.nextLine();
		System.out.println("Give me a adverb");
		String bookAdverb = in.nextLine();
		System.out.println("Hey are you bored?");
		System.out.println("Well, now you know how I fell day in and, day out."); 		
		System.out.println("Well back to the questions.");
		 try { 
			  	Thread.sleep(1000); 
			  } catch(InterruptedException ex){ 
			   
			  	System.exit(0); 
			  } 
		System.out.println("What is my mother's maiden name?");
		String Mname = in.nextLine();
		System.out.println("Time to continue.");
		System.out.println("When you think of letters of the Ste what name comes to mind?");
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
		System.out.println("What was it, again?");
		 try { 
			  	Thread.sleep(1900);  
			  } catch(InterruptedException ex){ 
			   
			  	System.exit(0); 
			  } System.out.println("Do you have any?");
		System.out.println("Wait no, I have work to do....");
		System.out.println("TIME TO CONTINUE");
		
		

		System.out.println("Have you thought of one yet?");
		 try { 
			  	Thread.sleep(1000); // 10000ms = 10s 
			  } catch(InterruptedException ex){ 
			   
			  	System.exit(0); 
			  } 
		System.out.println("What was it?");
		 try { 
			  	Thread.sleep(1000); 
			  } catch(InterruptedException ex){ 
			   
			  	System.exit(0); 
			  } 
		System.out.println("Welcome to the land of " +landname+ "nias.");
		 try { 
			  	Thread.sleep(1000); 
			  } catch(InterruptedException ex){ 
			   
			  	System.exit(0); 
			  } 
		System.out.println("You see far off in the distance, "+Aname+" the " +animal+ "is being hunted by the" +hunterN+ " the Hunter of Those in the " +terrain+".");
		System.out.println("Too, bad you cant, save them.");
		 try { 
			  	Thread.sleep(1000); 
			  } catch(InterruptedException ex){ 
			   
			  	System.exit(0); 
			  } 
		System.out.println("You see that "+Aname+ " found a hiding place.");
		System.out.println("Are you going to congradulat the animal?");
		System.out.println("Well too bad you are unable to congradulate the animal.");
		System.out.println("What is that in the sky?");
		System.out.println("Is  that an" +animal+ "?" );
		System.out.println("Wait no, its the" +Pname+ " of the " +terrain+ "and the Sky");
		System.out.println("During this time " +hunterN+" reads a book called " +bookAdverb+ " and "+bookNoun+ "  of" +bookNouns+ ".");
		 try { 
			  	Thread.sleep(1000); // 5000ms = 5s 
			  } catch(InterruptedException ex){ 
			   
			  	System.exit(0); 
			  } 
		System.out.println("He finds the book intresting, so a few hours go by.");
		System.out.println("Good for you, while " +hunterN+ "is busy the " +Aname+ "escapes.");
		System.out.println("THE END");
		System.out.println("Do you agree that?");
		System.out.println("Wait this a better version of Mad Lib");
		System.out.println("Give me some time.");
		 try { 
			  	Thread.sleep(3000); // 3000ms = 3s 
			  } catch(InterruptedException ex){ 
			   
			  	System.exit(0); 
			  } 
		System.out.println("Welcome to a land knowns as " +landname+ "nias");
		System.out.println("In this land, there are decks of cards, few are red, and the rest are blue and the senile" +color);
		System.out.println("You see each card holds something unique to them.");
		System.out.println("For example, the blue card holds " +event+ "quite an awesome day it was right.'");
		System.out.println("If your asking about the " +color+ "?" );
		System.out.println("We don't talk about it?");
		System.out.println("For the red card, its not really a card but a kingdom, it boasts " +bookNoun+ " there were many different creatures.");
		try { 
		  	Thread.sleep(5000); // 5000ms = 5s 
		  } catch(InterruptedException ex){ 
		   
		  	System.exit(0); 
		  } 
		System.out.println("Anway Hope I showed my point, I can talk to others...");
		
	}

}
