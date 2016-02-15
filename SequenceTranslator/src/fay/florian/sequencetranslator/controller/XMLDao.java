package fay.florian.sequencetranslator.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import fay.florian.sequencetranslator.model.Sequence;

public class XMLDao implements ISequenceDao {

	public ArrayList<Sequence> save(ArrayList<Sequence> sequences, File location) {

		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());

		ve.init();
		Template t = ve.getTemplate("fay/florian/sequencetranslator/vmfiles/sequence.vm");

		VelocityContext context = new VelocityContext();

		for (Sequence sequence : sequences) {
			context.put("entity", sequence);

			StringWriter writer = new StringWriter();
			t.merge(context, writer);
			String output = writer.toString();
			File outputFile = new File("xml/sequence" + sequence.getSequenceNumber() + ".xml");
			FileWriter myWriter;
			try {
				myWriter = new FileWriter(outputFile);

				BufferedWriter myBufferedWriter = new BufferedWriter(myWriter);

				myBufferedWriter.write(output);

				myBufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
