package org.pnv.mobileshop.dao.usermanagement;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.pnv.mobileshop.dao.BaseDao;
import org.pnv.mobileshop.dao.exception.UserAlreadyExistException;
import org.pnv.mobileshop.dao.exception.UserNotFoundException;

/**
 * 
 * This is DAO class responsible for access user table by User entity
 * Students need to implement sql query here
 * 
 * Created by huynhduychuong on Nov 13, 2016.
 * 
 */
public class UserDaoImpl extends BaseDao implements UserDao{

    private List<User> persistentUsers = new ArrayList<User>();
    
    public UserDaoImpl() {
        persistentUsers.add(new User(1, "admin", "admin123", "PNV Class 1", "admin"));
        persistentUsers.add(new User(2, "user1", "user123", "PNV Class 1", "user"));
        persistentUsers.add(new User(3, "user2", "user123", "PNV Class 1", "admin"));
    }
    /* (non-Javadoc)
     * @see org.pnv.mobileshop.dao.usermanagement.UserDao#findById(int)
     */
    public User findById(int id) throws UserNotFoundException {
        for(User user : persistentUsers) {
            if(user.getId() == id) {
                return user;
            }
        }
       throw new UserNotFoundException();
    }

    /* (non-Javadoc)
     * @see org.pnv.mobileshop.dao.usermanagement.UserDao#findByUsername(java.lang.String)
     */
    public User findByUsername(String username) throws UserNotFoundException {
        for(User user : persistentUsers) {
            if(StringUtils.isNotBlank(username) && username.trim().equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException();
    }

    /* (non-Javadoc)
     * @see org.pnv.mobileshop.dao.usermanagement.UserDao#create(org.pnv.mobileshop.dao.usermanagement.User)
     */
    public User create(User user) throws UserAlreadyExistException {
        try {
            findByUsername(user.getUsername());
            throw new UserAlreadyExistException();
        } catch (UserNotFoundException e) {
            persistentUsers.add(user);;
        }
        return user;
    }

    /* (non-Javadoc)
     * @see org.pnv.mobileshop.dao.usermanagement.UserDao#update(org.pnv.mobileshop.dao.usermanagement.User)
     */
    public User update(User user) throws UserNotFoundException {
        User exitUser = findById(user.getId());
        exitUser.setUsername(user.getUsername());
        exitUser.setPassword(user.getPassword());
        exitUser.setAddress(user.getAddress());
        exitUser.setRole(user.getRole());
        return exitUser;
    }

    /* (non-Javadoc)
     * @see org.pnv.mobileshop.dao.usermanagement.UserDao#findAll()
     */
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return persistentUsers;
    }

}
