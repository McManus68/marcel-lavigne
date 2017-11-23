package com.marcel.lavigne.services.impl;

import com.marcel.lavigne.model.User;
import com.marcel.lavigne.persistence.UserRepository;
import com.marcel.lavigne.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends EntityServiceImpl<User> implements UserService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public User changePassword(Long userId, String oldPassword, String newPassword) {
        User user = get(userId);
        if (user.getPassword().equals(oldPassword)) {
            user.setPassword(newPassword);
            update(user);
        }
        return user;
    }

    @Override 
    public User getByMail(String mail) {
        return ((UserRepository) repo).findByMail(mail);
    }

    @Override
    public Long add(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return super.add(user);
    }
}
