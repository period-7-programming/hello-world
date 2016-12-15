package hello.world;
import java.util.Scanner;
public class HelloWorld {
	
public static void main(String[] args){
	Scanner keyInput = new Scanner(System.in);
	System.out.println("English, Deutsch");
	String input = keyInput.next();
    
	if (input.equals("English")){
		English();
	} else if (input.equals("Deutsch")) {
		German();
	} else {
		System.out.println("Invalid Language!");
		System.out.println("Ungültige Sprache!");
	}
	keyInput.close();
}
public static void English(){
	Scanner keyInput = new Scanner(System.in);
	System.out.println("Hello World");
	System.out.println("Enter your name.");
	String input = keyInput.next();
	if (input.equals("no")) {
		System.out.println("Well ok then, I didn't want to know your name anyways!");
		System.out.println("Will you at least tell me what your favorite color is?");
	} else {
		System.out.println("Hello " + input + ", what is your favorite color?");
	}
	input = keyInput.next();
	System.out.println("Me too, where are you from?");
	input = keyInput.next();
	System.out.println("I've always wanted to go there, but since I am a computer program I cannot travel.");
    System.out.println("What is your lastname?");
	input = keyInput.next();
	System.out.println("");
	System.out.println("Thank you for participating in this program, this information has been reported to the police.");
	System.out.println("");
	System.out.println("Goodbye World");
	keyInput.close();
	
}

public static void German(){
	Scanner keyInput = new Scanner(System.in);
	System.out.println("Hallo Welt");
	System.out.println("Gib deinen Namen ein.");
	String input = keyInput.next();
	if (input.equals("nein")) {
		System.out.println("Nun gut, dann wollte ich euren Namen sowieso nicht wissen!");
		System.out.println("Werden Sie mir wenigstens sagen, was Ihre Lieblingsfarbe ist?");
	} else {
		System.out.println("Hallo " + input + ", was ist deine Lieblingsfarbe?");
	}
	input = keyInput.next();
	System.out.println("Ich auch, woher kommst du?");
	input = keyInput.next();
	System.out.println("Ich wollte schon immer dorthin gehen, aber da ich ein Computerprogramm bin kann ich nicht reisen.");
    System.out.println("Was ist dein Nachname?");
	input = keyInput.next();
	System.out.println("");
	System.out.println("Vielen Dank für die Teilnahme an diesem Programm, diese Informationen wurde der Polizei gemeldet.");
	System.out.println("");
	System.out.println("Auf Wiedersehen Welt");
	keyInput.close();

}
}
