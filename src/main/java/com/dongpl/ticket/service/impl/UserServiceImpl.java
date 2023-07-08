package com.dongpl.ticket.service.impl;

import com.dongpl.ticket.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getPasswordByUserName(String username) {
        String password = "";
        if ("admin".equals(username)) {
            password = "admin";
        }
        return password;
    }
}
