package com.bibick.core.dao;

import com.bibick.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: istrakhouski
 * Date: 12/24/13 3:15 PM
 */
public interface UserDAO extends JpaRepository<User, Long> {
}
