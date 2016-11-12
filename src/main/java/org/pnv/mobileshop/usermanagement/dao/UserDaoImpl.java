package org.pnv.mobileshop.usermanagement.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.pnv.mobileshop.usermanagement.dao.domain.User;

import com.mysql.jdbc.NotImplemented;


public class UserDaoImpl implements UserDao{

    private static final String DB_URL = "jdbc:mysql://192.168.0.21:3306/liquibase_demo";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static void main(String[] args) {
        new UserDaoImpl().findAll();
    }

    /* (non-Javadoc)
     * @see org.pnv.mobileshop.usermanagement.dao.UserDao#findAll()
     */
    public List<User> findAll() {
       
       
        //TODO
          return null;
    }

}
