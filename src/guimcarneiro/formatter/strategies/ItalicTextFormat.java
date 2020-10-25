package guimcarneiro.formatter.strategies;

import guimcarneiro.formatter.interfaces.TextFormatInterface;

public class ItalicTextFormat implements TextFormatInterface{

	@Override
	public String format(String text) {
		return "\033[3m" + text + "\033[0m";
	}
	
}
