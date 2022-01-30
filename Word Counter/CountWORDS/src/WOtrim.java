import java.util.Scanner;
import java.util.regex.*;

public class WOtrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		String document;
		int javaCount;
		Matcher matcher;
		System.out.print("Sentence: ");
		document = scanner.next();
		System.out.print("Word to find : ");
		String word =scanner.next();
		Pattern pattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE);
		
		
		
		javaCount = 0;
		matcher = pattern.matcher(document);
		while (matcher.find()) {
		javaCount++;
		}
		System.out.println("The word "+ word + " occurred " +
		javaCount + " times.");
	}

}
