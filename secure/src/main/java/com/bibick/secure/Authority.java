package com.bibick.secure;

import org.springframework.security.core.GrantedAuthority;

/**
 * User: istrakhouski
 * Date: 12/27/13 3:42 PM
 */
public class Authority implements GrantedAuthority {

    private String authority = "";

    public Authority(String authority) {
        this.authority = authority;
    }

    public Authority() {

    }

    public String getAuthority() {
        return authority;
    }
}
