import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Sentence {
	private String message;
	private String[] splitMessage;
	private List<String> words;
	
	public Sentence(String message) {
		this.message = message;
		this.splitMessage = this.message.split("\\s+");
		this.words = new ArrayList<String>();
		for (String word : this.splitMessage) {
			this.words.add(word);
		}
	}
	
	public String reverse() {
		return new StringBuilder(this.message).reverse().toString().trim();
	}
	
	public int charCount() {
		int count = 0;
		for (int i = 0; i < this.message.length(); i++) {
			count++;
		}
		return count;
	}
	
	public int wordCount() {
		return this.splitMessage.length;
	}
	
	public String scramble() {
		Random r = new Random();
		String output = "";
		for (int i = 0; i < this.words.size(); i++) {
			output += this.words.get(r.nextInt(this.words.size())) + " ";
		}
		return output;
	}
	
	public void add(String words) {
		String[] list = words.trim().split("\\s+");
		for (String word : list) {
			this.words.add(word);
		}
	}
	
	public String toString() {
		return this.words.toString();
	}
}
