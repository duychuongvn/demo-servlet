package org.pnv.mobileshop.usermanagement.service;

import java.util.List;

import org.pnv.mobileshop.usermanagement.dao.domain.User;

public interface UserService {

    List<User> findAll(String id);
}
