package hello.world;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// console object
		Scanner user_input = new Scanner( System.in );
		String name;
		String location;
		String color;
		String age;
		
		System.out.println("Enter your name."); 
		name = user_input.next();
		System.out.println("Welcome, " + name + ".");
		System.out.println("Where are you from, " + name + "?");
		location = user_input.next();
		System.out.println("Nice to meet you, " + name + " from the location of " + location + ".");
		System.out.println("What's your favorite color?");
		color = user_input.next();
		System.out.println("I like that color too.");
		System.out.println("How old are you?");
		age = user_input.next();
		System.out.println("Thank you for this information. Have a good day.");
		user_input.close();
		//other way: String input = System.console().readLine();
		//doesnt work in eclipse IDE ^
	}

}
