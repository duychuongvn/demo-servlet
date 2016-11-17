package org.pnv.mobileshop.dao.usermanagement;

import java.util.List;

import org.pnv.mobileshop.dao.BaseDao;
import org.pnv.mobileshop.dao.exception.UserAlreadyExistException;
import org.pnv.mobileshop.dao.exception.UserNotFoundException;

public interface UserDao extends BaseDao<User, Integer>{

    User findOne(int id) throws UserNotFoundException;
    User findByUsername(String username)  throws UserNotFoundException;
    User create(User user) throws UserAlreadyExistException;
    User update(User user) throws UserNotFoundException;
  
}
