package com.project.app.application.service;

import org.springframework.security.core.userdetails.User;

public interface UserDetailsService {
    User LoadUserByUsername(String username);
}
