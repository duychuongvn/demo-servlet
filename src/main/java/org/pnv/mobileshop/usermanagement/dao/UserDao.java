package org.pnv.mobileshop.usermanagement.dao;

import java.util.List;

import org.pnv.mobileshop.usermanagement.dao.domain.User;

public interface UserDao {

    List<User> findAll();
}
