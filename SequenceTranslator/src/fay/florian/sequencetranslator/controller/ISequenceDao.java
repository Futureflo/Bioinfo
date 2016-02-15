package fay.florian.sequencetranslator.controller;

import java.io.File;
import java.util.ArrayList;

import fay.florian.sequencetranslator.model.Sequence;

public interface ISequenceDao {

	// public Sequence load(File location);

	public ArrayList<Sequence> save(ArrayList<Sequence> sequences, File location);

}
