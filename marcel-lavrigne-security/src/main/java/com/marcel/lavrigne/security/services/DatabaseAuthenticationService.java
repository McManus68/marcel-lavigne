package com.marcel.lavrigne.security.services;

import com.marcel.lavrigne.model.User;
import com.marcel.lavrigne.persistence.UserRepository;
import com.marcel.lavrigne.security.model.AuthenticatedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DatabaseAuthenticationService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) {
        User user = userRepository.findByLogin(login);
        if (user == null) {
            throw new UsernameNotFoundException(login);
        }
        return new AuthenticatedUser(user);
    }
}