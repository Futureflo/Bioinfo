package fay.florian.sequencetranslator.test;

import java.io.File;
import java.util.ArrayList;

import fay.florian.sequencetranslator.controller.TXTDao;
import fay.florian.sequencetranslator.model.DNASequence;
import fay.florian.sequencetranslator.model.Sequence;

public class TXTDaoTester {

	public static void main(String[] args) {

		TXTDao myDao = TXTDao.getInstance();

		ArrayList<Sequence> sequences = new ArrayList<Sequence>();

		Sequence mySequence = new DNASequence();
		mySequence.setSequenceNumber(1);
		mySequence.setSequence("AUGAUGAUG");

		Sequence mySequence2 = new DNASequence();
		mySequence2.setSequenceNumber(2);
		mySequence2.setSequence("UAUAUAUA");

		sequences.add(mySequence);
		sequences.add(mySequence2);

		File location = new File("translation");

		myDao.save(sequences, location);
	}

}
