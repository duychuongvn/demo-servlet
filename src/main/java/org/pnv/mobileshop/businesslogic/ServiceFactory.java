package org.pnv.mobileshop.businesslogic;

import org.pnv.mobileshop.businesslogic.exception.ServiceNotFoundException;
import org.pnv.mobileshop.businesslogic.usermanagement.UserService;
import org.pnv.mobileshop.businesslogic.usermanagement.UserServiceImpl;

public class ServiceFactory {

	@SuppressWarnings("unchecked")
	public static <T> T getService(Class<T> serviceType) {
		if (UserService.class.equals(serviceType)) {
			return (T) new UserServiceImpl();
		}
		throw new ServiceNotFoundException();
	}
}
