package guimcarneiro.formatter.strategies;

import guimcarneiro.formatter.interfaces.TextFormatInterface;

public class UppercaseTextFormat implements TextFormatInterface {

	@Override
	public String format(String text) {
		return ("" + text).toUpperCase();
	}
	
}
