import java.util.Random;


public class Sentence {
	private String message;
	private String[] splitMessage;
	
	public Sentence(String message) {
		this.message = message;
		this.splitMessage = this.message.split("\\s+");
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
		for (int i = 0; i < this.splitMessage.length; i++) {
			output += this.splitMessage[r.nextInt(this.splitMessage.length)] + " ";
		}
		return output;
	}
}
