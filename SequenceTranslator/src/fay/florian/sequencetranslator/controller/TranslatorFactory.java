package fay.florian.sequencetranslator.controller;

public class TranslatorFactory {

	public static ITranslator getTranslator(String translationType) {
		return DNA2AATranslator.getInstance();
	}
}
