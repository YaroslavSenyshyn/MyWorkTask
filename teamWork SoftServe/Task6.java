package Chellange;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
	
	public static void calculateNumberOfWords(Scanner sc) {
		String someText = sc.nextLine();
		int calculateWord = 0;
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher(someText);

		while (m.find()) {
			calculateWord++;
		}
		System.out.println("Number of words: "+(calculateWord+1));
	}
}
