package com.marcel.lavigne.services;

import com.marcel.lavigne.model.User;

public interface UserService extends EntityService<User> {

    User changePassword(Long userId, String oldPassword, String newPassword);

    User getByMail(String mail);

}
