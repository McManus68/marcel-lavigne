package com.marcel.lavrigne.services;

import com.marcel.lavrigne.model.User;

public interface UserService extends EntityService<User> {

    User changePassword(Long userId, String oldPassword, String newPassword);

    User getByMail(String mail);
}
