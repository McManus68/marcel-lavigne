package com.marcel.lavrigne.services.impl;

import org.springframework.stereotype.Service;

import com.marcel.lavrigne.model.User;
import com.marcel.lavrigne.persistence.UserRepository;
import com.marcel.lavrigne.services.UserService;

@Service
public class UserServiceImpl extends EntityServiceImpl<User> implements UserService {
   
    public User getLoggedUser() {
        return ((UserRepository) repo).findById(authSrv.getLoggedUser().getId()).get();
    }

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
    
}
