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
		System.out.println("Welcome to :< Libs!");
		System.out.println("Hello");
		System.out.println("Enter a name?");
		String name = in.nextLine();
		System.out.println("What animal pops into you head? When you think of the word flight.");
		String animal = in.nextLine();
		System.out.println("This animal is being hunted by an that walks what is it");
		String book = in.nextLine();
		System.out.println("Give me a name");
		String hunterN = in.nextLine();
		System.out.println(name+" the " +animal+ "is being hunted by the Jack the Hunter of Tousand Tiger Tails");
		System.out.println("During this time Jack the hunter teaches chases the creatures and reads the book called " +book+ ".");

	}

}
