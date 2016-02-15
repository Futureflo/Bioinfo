package fay.florian.sequencetranslator.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import fay.florian.sequencetranslator.model.Sequence;
import fay.florian.sequencetranslator.view.ErrorMessageView;

public class TXTDao implements ISequenceDao {

	public ArrayList<Sequence> save(ArrayList<Sequence> sequences, File location) {
		try {
			/*
			 * Add additonal text/sequences to the end of the file
			 */
			FileWriter fileWriter = new FileWriter(location, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.newLine();

			String now = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
			bufferedWriter.write("Saved: " + now);
			bufferedWriter.newLine();

			for (Sequence sequence : sequences) {
				long sequenceNumber = sequence.getSequenceNumber();
				String seq = sequence.getSequence();

				bufferedWriter.write("Sequencenumber: " + sequenceNumber);
				bufferedWriter.newLine();
				bufferedWriter.write(seq);
				bufferedWriter.newLine();
				bufferedWriter.newLine();
			}
			bufferedWriter.close();

		} catch (IOException e) {

			ErrorMessageView myErrorView = new ErrorMessageView("The path " + location + " seems not to be correct.");

			e.printStackTrace();
		}

		/*
		 * TODO replace by save
		 */
		return null;
	}

}
