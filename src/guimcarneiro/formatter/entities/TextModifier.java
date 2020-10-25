package guimcarneiro.formatter.entities;

import guimcarneiro.formatter.enums.TextFormatEnum;
import guimcarneiro.formatter.factories.TextFormatFactory;
import guimcarneiro.formatter.interfaces.TextFormatInterface;

public class TextModifier {
	
	private TextFormatInterface modifier;
	
	public TextModifier() {
		this.modifier = TextFormatFactory.build(TextFormatEnum.LOWERCASE);
	}
	
	public TextModifier(TextFormatEnum initialTextFormat) {
		this.modifier = TextFormatFactory.build(initialTextFormat);
	}
	
	public String modify(String text){
		return this.modifier.format(text);
	}
	
	public void changeModifierTo(TextFormatEnum newTextFormat) {
		this.modifier = TextFormatFactory.build(newTextFormat);
	}
	
}
