package guimcarneiro.formatter;

import guimcarneiro.formatter.entities.TextModifier;
import guimcarneiro.formatter.enums.TextFormatEnum;

public class Main {

	public static void main(String[] args) {
		String testText = "Hello world!";
		
		// Default format is lowercase, but it is explicit here
		TextModifier formatter = new TextModifier(TextFormatEnum.LOWERCASE);
		
		System.out.println("Lowercase: " + formatter.modify(testText) + "\n");
		formatter.changeModifierTo(TextFormatEnum.UPPERCASE);
		System.out.println("Uppercase: " + formatter.modify(testText) + "\n");
		formatter.changeModifierTo(TextFormatEnum.ITALIC);
		System.out.println("Italic: " + formatter.modify(testText) + "\n");
		formatter.changeModifierTo(TextFormatEnum.BOLD);
		System.out.println("Bold: " + formatter.modify(testText) + "\n");
	}

}
