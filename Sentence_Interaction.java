import java.util.Scanner;

public class Sentence_Interaction {
	public static void main(String[] parameters) {
		giveIntro();
		Scanner console = new Scanner(System.in);
		Sentence sentence = new Sentence(getPhrase(console));
		promptUser(console, sentence);
		doStuff(console, sentence);
		
	}

	public static void giveIntro() {
		System.out.println("Don't even question why this is an existing class.");
		System.out.println("It's really ugly and we're not even going to be using this");
		System.out.println("in a very wise manner but oh well. What more can I do?");
		System.out.println();
		System.out.println("Give me a phrase man...");
		System.out.println();
	}

	public static String getPhrase(Scanner console) {
		return console.nextLine();
	}

	public static void promptUser(Scanner console, Sentence sentence) {
		System.out.print("Your phrase has a total of " + sentence.charCount() + " characters and ");
		System.out.println(sentence.wordCount() + " words.");
		System.out.println();
	}
	
	public static void doStuff(Scanner console, Sentence sentence) {
		System.out.println("What would you like to do?");
		String option1 = "1) Reverse your phrase";
		String option2 = "2) Scramble your phrase";
		String option3 = "3) Quit this stupid program";
		System.out.printf("\t%s\n\t%s\n\t%s\n", option1, option2, option3);
		System.out.print("I want to: ");
		int response = console.nextInt();
		if (response == 1) {
			System.out.println("Reversed sentence: " + sentence.reverse());
			System.out.println();
			doStuff(console, sentence);
		} else if (response == 2) {
			System.out.println("Scrambled sentence: " + sentence.scramble());
			System.out.println();
			doStuff(console, sentence);
		} else {
			System.out.printf("\t%s", "You've ended this stupid program. Have a nice day!");
		}
	}
}