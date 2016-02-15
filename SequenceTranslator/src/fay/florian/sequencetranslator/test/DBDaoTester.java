package fay.florian.sequencetranslator.test;

import java.io.File;
import java.util.ArrayList;

import fay.florian.sequencetranslator.controller.DBDao;
import fay.florian.sequencetranslator.model.DNASequence;
import fay.florian.sequencetranslator.model.Sequence;

public class DBDaoTester {

	public static void main(String[] args) {

		DBDao myDao = DBDao.getInstance();

		ArrayList<Sequence> sequences = new ArrayList<Sequence>();

		Sequence mySequence = new DNASequence();
		mySequence.setSequenceNumber(1);
		mySequence.setSequence("AUGUGUAUA");

		sequences.add(mySequence);

		File location = new File("location");

		myDao.save(sequences, location);
	}

}
