package org.pnv.mobileshop.dao.exception;

public class DaoNotFoundException extends RuntimeException {

	public DaoNotFoundException(Class<?> daoType) {
		super("Dao not implemened: " + daoType);
	}

}
