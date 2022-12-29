package com.bkb.service;





import com.bkb.domain.User;

import java.util.List;


public interface UserService {
    List<User> getAll();
    User getById(Integer id);

    boolean save(User user);

    boolean update(User user);

    boolean delete(Integer id);

    User Login(User user);
}
