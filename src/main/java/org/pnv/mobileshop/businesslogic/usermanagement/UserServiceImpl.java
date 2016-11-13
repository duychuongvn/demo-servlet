package org.pnv.mobileshop.businesslogic.usermanagement;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.ListUI;

import org.pnv.mobileshop.dao.exception.UserNotFoundException;
import org.pnv.mobileshop.dao.usermanagement.User;
import org.pnv.mobileshop.dao.usermanagement.UserDao;
import org.pnv.mobileshop.dao.usermanagement.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    public List<UserModel> getUserList() {
        List<UserModel> userModels = new ArrayList<UserModel>();
        List<User> users = userDao.findAll();
        for (User user : users) {
            userModels.add(new UserModel(user.getId(), user.getUsername(), user.getAddress(), user.getRole()));
          
        }

        return userModels;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pnv.mobileshop.businesslogic.usermanagement.UserService#
     * findByUsername(java.lang.String)
     */
    public User findByUsername(String username) throws UserNotFoundException {
        
        return userDao.findByUsername(username);
    }
}
