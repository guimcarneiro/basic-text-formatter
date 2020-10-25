package guimcarneiro.formatter.factories;

import guimcarneiro.formatter.enums.TextFormatEnum;
import guimcarneiro.formatter.interfaces.TextFormatInterface;
import guimcarneiro.formatter.strategies.BoldTextFormat;
import guimcarneiro.formatter.strategies.ItalicTextFormat;
import guimcarneiro.formatter.strategies.LowercaseTextFormat;
import guimcarneiro.formatter.strategies.UppercaseTextFormat;

public class TextFormatFactory {
	
	public static TextFormatInterface build(TextFormatEnum textFormat) {
		switch(textFormat) {
		case BOLD:
			return new BoldTextFormat();
		
		case ITALIC:
			return new ItalicTextFormat();
		
		case UPPERCASE:
			return new UppercaseTextFormat();
		
		case LOWERCASE:
			return new LowercaseTextFormat();
		}
		
		return null;
	}
	
}
