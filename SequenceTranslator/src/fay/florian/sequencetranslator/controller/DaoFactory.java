package fay.florian.sequencetranslator.controller;

public class DaoFactory {

	public static ISequenceDao getDao(String daoType) {

		ISequenceDao myDao = null;

		if (daoType == "DB") {
			myDao = DBDao.getInstance();
		} else if (daoType == "TXT") {
			myDao = TXTDao.getInstance();
		} else if (daoType == "XML") {
			myDao = XMLDao.getInstance();
		}

		return myDao;
	}
}
