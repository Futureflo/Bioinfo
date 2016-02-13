package fay.florian.sequencetranslator.model;

import java.util.HashMap;


public class GeneticalHashMap {

	protected GeneticalHashMap() {

	}

	private static GeneticalHashMap instance = null;

	public static GeneticalHashMap getInstance() {
		if (instance == null) {
			instance = new GeneticalHashMap();
		}
		return instance;
	}

	public HashMap<String, String> generateHashMap() {
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("AUG", "Met");

		hm.put("UGG", "Trp");

		hm.put("UAU", "Tyr");
		hm.put("UAC", "Tyr");

		hm.put("UUU", "Phe");
		hm.put("UUC", "Phe");

		hm.put("UGU", "Cys");
		hm.put("UGC", "Cys");

		hm.put("AAU", "Asn");
		hm.put("AAC", "Asn");

		hm.put("GAU", "Asp");
		hm.put("GAC", "Asp");

		hm.put("CAA", "Gln");
		hm.put("CAG", "Gln");

		hm.put("GAA", "Glu");
		hm.put("GAG", "Glu");

		hm.put("CAU", "His");
		hm.put("CAC", "His");

		hm.put("AAA", "Lys");
		hm.put("AAG", "Lys");

		hm.put("AUU", "Ile");
		hm.put("AUC", "Ile");
		hm.put("AUA", "Ile");

		hm.put("GGU", "Gly");
		hm.put("GGC", "Gly");
		hm.put("GGA", "Gly");
		hm.put("GGG", "Gly");

		hm.put("GCU", "Ala");
		hm.put("GCC", "Ala");
		hm.put("GCA", "Ala");
		hm.put("GCG", "Ala");

		hm.put("GUU", "Val");
		hm.put("GUC", "Val");
		hm.put("GUA", "Val");
		hm.put("GUG", "Val");

		hm.put("ACU", "Thr");
		hm.put("ACC", "Thr");
		hm.put("ACA", "Thr");
		hm.put("ACG", "Thr");

		hm.put("CCU", "Pro");
		hm.put("CCC", "Pro");
		hm.put("CCA", "Pro");
		hm.put("CCG", "Pro");

		hm.put("CUU", "Leu");
		hm.put("CUC", "Leu");
		hm.put("CUA", "Leu");
		hm.put("CUG", "Leu");
		hm.put("UUA", "Leu");
		hm.put("UUG", "Leu");

		hm.put("UCU", "Ser");
		hm.put("UCC", "Ser");
		hm.put("UCA", "Ser");
		hm.put("UCG", "Ser");
		hm.put("AGU", "Ser");
		hm.put("AGC", "Ser");

		hm.put("CGU", "Arg");
		hm.put("CGC", "Arg");
		hm.put("CGA", "Arg");
		hm.put("CGG", "Arg");
		hm.put("AGA", "Arg");
		hm.put("AGG", "Arg");

		hm.put("UAA", "STP");
		hm.put("UAG", "STP");
		hm.put("UGA", "STP");

		return hm;
	}

}
