package guimcarneiro.formatter.strategies;

import guimcarneiro.formatter.interfaces.TextFormatInterface;

public class BoldTextFormat implements TextFormatInterface {

	@Override
	public String format(String text) {
		return "\033[1m" + text + "\033[1m";
	}

}
