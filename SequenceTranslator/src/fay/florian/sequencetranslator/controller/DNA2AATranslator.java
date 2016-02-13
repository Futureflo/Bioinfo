package fay.florian.sequencetranslator.controller;

public class DNA2AATranslator implements ITranslator {

	private static DNA2AATranslator instance;

	private DNA2AATranslator() {

	}

	public static DNA2AATranslator getInstance() {
		if (instance == null) {
			instance = new DNA2AATranslator();
		}
		return instance;
	}

	public String translate(String sequence) {
		return null;
	}

}
