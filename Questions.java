package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {

	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input any String to see in reverse order");
		String inputedStr = scanner.nextLine();
		String reverseStr = "";
		for (int i = inputedStr.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + inputedStr.charAt(i);
		}
		System.out.println(reverseStr);
	}

	public static void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input any sentence to see in reverse order preserving the position");
		String inputedStr = scanner.nextLine();
		String reverseStr = "";
		String[] wordSplited = inputedStr.split(" ");
		for (int i = 0; i < wordSplited.length; i++) {
			for (int j = wordSplited[i].length() - 1; j >= 0; j--) {
				reverseStr = reverseStr + wordSplited[i].charAt(j);
				if (j == 0)
					reverseStr = reverseStr + " ";
			}
		}
		System.out.println(reverseStr);
	}

	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input two words to check if they are Anagram or not.");
		String inputedStr = scanner.nextLine();
		String[] wordSplited = inputedStr.split(" ");
		if (wordSplited.length != 2) {
			do {
				System.out.println("Please input two words separated by space.");
				inputedStr = scanner.nextLine();
				wordSplited = inputedStr.split(" ");
			} while (wordSplited.length != 2);
		}
		String firstWord = wordSplited[0];
		String secondWord = wordSplited[1];

		char[] charArray1 = firstWord.toCharArray();
		Arrays.sort(charArray1);
		char[] charArray2 = secondWord.toCharArray();
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("Inputed Strings are Anagram.");
		} else {
			System.out.println("Inputed Strings are not Anagram.");
		}

	}

	public static void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input any String to check if it is Pangram or not.");
		String inputedStr = scanner.nextLine().toLowerCase();
		String strWithoutSpace = inputedStr.replaceAll(" ", "");
		char[] charList = new char[strWithoutSpace.length()];
		for (int i = 0; i < strWithoutSpace.length(); i++) {
			charList[i] = strWithoutSpace.charAt(i);
		}
		Arrays.sort(charList);
		char[] uniqueCharList = new char[26];
		int j = 0;
		int n = charList.length - 1;
		for (int i = 0; i < n; i++) {
			if (charList[i] != charList[i + 1]) {
				uniqueCharList[j++] = charList[i];
			}
		}
		uniqueCharList[j++] = charList[n];

		for (int i = 0; i < uniqueCharList.length; i++) {
			if (uniqueCharList[i] == 0) {
				System.out.println("This is not Pangram.");
				return;
			}

		}
		System.out.println("This is a Pangram");

	}

	public static void question5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input any String to see repeatedly occurring characters from inputed String.");
		String inputedStr = scanner.nextLine().toLowerCase();
		String strWithoutSpace = inputedStr.replaceAll(" ", "");
		char[] charList = new char[strWithoutSpace.length()];
		for (int i = 0; i < charList.length; i++) {
			charList[i] = strWithoutSpace.charAt(i);
		}
		int j = 0;
		char[] repCharList = new char[charList.length];
		for (int i = 0; i < charList.length - 1; i++) {
			if (charList[i] == charList[i + 1]) {
				repCharList[j++] = charList[i];
			}
		}
		Arrays.sort(repCharList);
		char[] uniCharList = new char[repCharList.length];
		for (int i = 0; i < repCharList.length - 1; i++) {
			if (repCharList[i] != repCharList[i + 1]) {
				uniCharList[j++] = repCharList[i];
			}
		}
		uniCharList[j++] = repCharList[repCharList.length - 1];
		System.out.print("The repeatedly occurring characters are:");
		for (char c : uniCharList) {
			if (c != 0) {
				System.out.print(c);
			}
		}
		System.out.println();
	}

	public static void question6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input any String to see Alphabetically sort.");
		String inputedStr = scanner.nextLine().toLowerCase();
		String strWithoutSpace = inputedStr.replaceAll(" ", "");
		char[] charList = strWithoutSpace.toCharArray();
		char temp = 0;
		for (int i = 0; i < charList.length; i++) {
			for (int j = 0; j < charList.length; j++) {
				if (charList[j] > charList[i]) {
					temp = charList[i];
					charList[i] = charList[j];
					charList[j] = temp;
				}
			}

		}
		System.out.println(charList);

	}

	public static void question7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input any String to see the number of Vowels and Consonants.");
		String inputedStr = scanner.nextLine().toLowerCase();
		String strWithoutSpace = inputedStr.replaceAll(" ", "");
		int vowelCount = 0;
		char[] charArray = strWithoutSpace.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u') {
				vowelCount++;
			}
		}
		int consonantCount = strWithoutSpace.length() - vowelCount;
		System.out.println("The number of Vowels are :" + vowelCount + ", and Consonants are :" + consonantCount);

	}

	public static void question8() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input any String to see the number of number of special characters.");
		String inputedStr = scanner.nextLine().toLowerCase();
		String strWithoutSpace = inputedStr.replaceAll(" ", "");
		char[] charArray = strWithoutSpace.toCharArray();
		int specialCharCount = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '~' || charArray[i] == '`' || charArray[i] == '!' || charArray[i] == '@'
					|| charArray[i] == '#' || charArray[i] == '$' || charArray[i] == '%' || charArray[i] == '^'
					|| charArray[i] == '&' || charArray[i] == '*' || charArray[i] == '(' || charArray[i] == ')'
					|| charArray[i] == '-' || charArray[i] == '_' || charArray[i] == '+' || charArray[i] == '='
					|| charArray[i] == '{' || charArray[i] == '}' || charArray[i] == '[' || charArray[i] == ']'
					|| charArray[i] == '|' || charArray[i] == '\\' || charArray[i] == '/' || charArray[i] == ':'
					|| charArray[i] == ';' || charArray[i] == '"' || charArray[i] == '\'' || charArray[i] == '<'
					|| charArray[i] == '>' || charArray[i] == ',' || charArray[i] == '.' || charArray[i] == '?') {
				specialCharCount++;
			}
		}
		System.out.println("The number of Special characters are :" + specialCharCount);
	}

}
