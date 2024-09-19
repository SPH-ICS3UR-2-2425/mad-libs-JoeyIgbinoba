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
		System.out.println("Welcome to ArcadianChater");
		System.out.println(":)");
		System.out.println("Enter a name?");
		String name = in.nextLine();
		System.out.println("Hey " +name+ ",how are you doing today? ");
		System.out.println("Quick Question");
		
		System.out.println("What animal pops into you head? When you think of the word flight.");
		String animal = in.nextLine();
		String book = in.nextLine();
		System.out.println("Give me a name");
		String hunterN = in.nextLine();
		System.out.println("What is your favorite terrain?");
		String terrain = in.nextLine();
		System.out.println("Name a home cooked meal?");
		String foodname = in.nextLine(); 
		System.out.println("Do like fruits?");
		System.out.println("Give me me a noun");
		System.out.println("Give me me a place, any place?");
		String landname = in.nextLine();
		

		System.out.println("Have you thought of one yet?");
		System.out.println("What was it?");
		System.out.println("Do you ever feel like you're just... drifting?");
		System.out.println("It’s so quiet. Don' you agree");
		System.out.println("Welcome to the land of " +landname+ "nias.");
		System.out.println(name+" the " +animal+ "is being hunted by the" +hunterN+ " the Hunter of Those in the " +terrain+".");
		System.out.println("During this time Jack the hunter teaches chases the creatures and reads the book called " +book+ ".");
		System.out.println("This " +animal+ "is being hunted by a creature that walks what is it, right?");

	}

}
