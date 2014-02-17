package com.bibick.secure.provoders;

import com.bibick.core.dao.UserDAO;
import com.bibick.core.model.User;
import com.bibick.secure.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * User: istrakhouski
 * Date: 12/24/13 3:13 PM
 */
@Component
public class FarmAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserDAO userDAO;

    //TODO: implement correct authorisation
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Object pass = authentication.getCredentials();
        Object login = authentication.getPrincipal();

        User user = userDAO.findUserByFirstNameAndPassword(login, pass);

        if(user != null) {
            Collection<Authority> authorities = new ArrayList<Authority>();
            authorities.add(new Authority("ROLE_USER"));
            authentication = new UsernamePasswordAuthenticationToken(login, pass, authorities);
        }

        return authentication;
    }

    public boolean supports(Class<?> aClass) {
        return true;
    }
}
