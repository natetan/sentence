import java.util.Scanner;

public class SentenceMain {
	public static void main(String[] parameters) {
		giveIntro();
		Scanner console = new Scanner(System.in);
		Sentence sentence = new Sentence(getPhrase(console));
		promptUser(console, sentence);
		interact(console, sentence);
		
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
	
	public static void interact(Scanner console, Sentence sentence) {
		System.out.println("What would you like to do?");
		String option1 = "1) Reverse your phrase";
		String option2 = "2) Scramble your phrase";
		String option3 = "3) Add words to the phrase";
		String option4 = "4) Print out your phrase";
		String option5 = "5) Quit this stupid program";
		System.out.printf("\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\n", option1, option2, option3, option4, option5);
		System.out.print("I want to: ");
		int response = console.nextInt();
		if (response == 1) {
			System.out.println("Reversed sentence: " + sentence.reverse());
			System.out.println();
			interact(console, sentence);
		} else if (response == 2) {
			System.out.println("Scrambled sentence: " + sentence.scramble());
			System.out.println();
			interact(console, sentence);
		} else if (response == 3) {
			System.out.println("Give me words to add to the list");
			System.out.print("Type here: ");
			// The problem is that this line only takes 1 word at a time...
			sentence.add(console.next());
			System.out.println();
			interact(console, sentence);
		} else if (response == 4) {
			System.out.println("Your phrase: " + sentence.toString());
			System.out.println();
			interact(console, sentence);
		} else {
			System.out.printf("\t%s", "You've ended this stupid program. Have a nice day!");
		}
	}
}