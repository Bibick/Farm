package com.bibick.secure;

import com.bibick.core.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * User: istrakhouski
 * Date: 12/24/13 3:13 PM
 */
@Component
public class FarmAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserDAO userDAO;

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //userDAO.findOne()
        Object cred = authentication.getCredentials();
        return null;
    }

    public boolean supports(Class<?> aClass) {
        return false;
    }
}
