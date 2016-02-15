package fay.florian.sequencetranslator.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import fay.florian.sequencetranslator.model.GeneticalHashMap;

public class DNA2AATranslator implements ITranslator {

	private static DNA2AATranslator instance;

	protected DNA2AATranslator() {

		this.init();
	}

	public static DNA2AATranslator getInstance() {
		if (instance == null) {
			instance = new DNA2AATranslator();
		}
		return instance;
	}

	private void init() {

		myHashMap = GeneticalHashMap.getInstance();
		hm = myHashMap.generateHashMap();
	}

	GeneticalHashMap myHashMap;
	HashMap<String, String> hm;

	public ArrayList<String> translate(String sequence) {

		String[] stopCodon = new String[] { "UAA", "UAG", "UGA" };

		ArrayList<String> translatedSequences = new ArrayList<>();
		int position = 0;
		String translatedSequence = "";

		while (position < sequence.length() - 2) {

			String triplet = sequence.substring(position, position + 3);
			if (triplet.equals("AUG")) {
				int innerPosition = position;
				while (innerPosition < sequence.length() - 2) {
					triplet = sequence.substring(innerPosition, innerPosition + 3);
					/*
					 * if triplet is stopCodon jump out. TODO improve!
					 */
					if (Arrays.asList(stopCodon).contains(triplet)) {
						innerPosition = sequence.length();

					} else {
						String as = hm.get(triplet);
						translatedSequence = translatedSequence + as;
						innerPosition += 3;
					}
				}
				translatedSequences.add(translatedSequence);
				translatedSequence = "";
			}
			position += 1;

		}
		return translatedSequences;
	}

}
