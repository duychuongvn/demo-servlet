package org.pnv.mobileshop.dao;

import org.pnv.mobileshop.dao.exception.DaoNotFoundException;
import org.pnv.mobileshop.dao.productmanagement.ProductDao;
import org.pnv.mobileshop.dao.productmanagement.ProductDaoImpl;
import org.pnv.mobileshop.dao.usermanagement.UserDao;
import org.pnv.mobileshop.dao.usermanagement.UserDaoImpl;

public class DaoFactory {

	public static <T extends  BaseDao> T getDao(Class<T> daoType) throws DaoNotFoundException {
		if (UserDao.class.equals(daoType)) {
			return (T) new UserDaoImpl();
		}

		if (ProductDao.class.equals(daoType)) {
			return (T) new ProductDaoImpl();
		}
		throw new DaoNotFoundException(daoType);
	}
}
