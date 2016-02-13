package fay.florian.sequencetranslator.controller;

import java.io.File;

import fay.florian.sequencetranslator.model.Sequence;

public interface ISequenceDao {

	public Sequence load(File location);
	
	public Sequence save(File location);
	
	
	
	
}
