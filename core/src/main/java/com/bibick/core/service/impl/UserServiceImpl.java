package com.bibick.core.service.impl;

import com.bibick.core.dao.UserDAO;
import com.bibick.core.model.User;
import com.bibick.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: istrakhouski
 * Date: 2/17/14 11:44 AM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public User getUserByName(String userName) {
        return userDAO.findUserByFirstName(userName);
    }
}
