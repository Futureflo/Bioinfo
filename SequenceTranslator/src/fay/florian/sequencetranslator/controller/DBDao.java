package fay.florian.sequencetranslator.controller;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fay.florian.sequencetranslator.model.Sequence;

public class DBDao implements ISequenceDao {

	public ArrayList<Sequence> save(ArrayList<Sequence> sequences, File location) {

		Connection con = null;
		Statement stmt;
		try {
			/*
			 * Connection to mySQL-db on localhost (127.0.0.1) on port 3306 with
			 * db sequencetranslator (not password secured
			 */
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sequencetranslator?user=root&password=");
			/*
			 * Create Statement to communicate with db
			 */

			stmt = con.createStatement();
			/*
			 * Send save-query to db
			 */

			for (Sequence sequence : sequences) {
				long sequenceNumber = sequence.getSequenceNumber();
				String seq = sequence.getSequence();
				stmt.executeUpdate("insert into sequence (sequencenumber, sequence) values (" + sequenceNumber + ", '"
						+ seq + "');");

			}

			stmt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			/*
			 * Try-Catch needed for case if there is no db-connection
			 */
			try {
				/*
				 * Close connection
				 */
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		/*
		 * TODO must be replaced by load
		 */
		return null;
	}

}
