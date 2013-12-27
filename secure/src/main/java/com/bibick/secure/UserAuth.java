package com.bibick.secure;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * User: istrakhouski
 * Date: 12/27/13 11:15 AM
 */
public class UserAuth extends UsernamePasswordAuthenticationToken {

    public UserAuth(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public UserAuth(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }
}
