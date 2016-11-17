package org.pnv.mobileshop.businesslogic.usermanagement;

import java.util.List;

import org.pnv.mobileshop.dao.exception.UserNotFoundException;
import org.pnv.mobileshop.dao.usermanagement.User;

public interface UserService {

    User findByUsername(String username) throws UserNotFoundException;

    List<UserModel> getUserList();
}
