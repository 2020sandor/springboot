package com.bkb.service.impl;



import com.bkb.dao.UserDao;
import com.bkb.domain.User;
import com.bkb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
@Autowired
    private UserDao userDao;

    public List<User> getAll() {
        return userDao.getAll();
    }

    public User getById(Integer id) {
        return userDao.getById(id);
    }
    public boolean save(User user){
        return userDao.save(user);
    }

    public boolean update(User user){
        return userDao.update(user);
    }

    public boolean delete(Integer id){
        return userDao.delete(id);
    }
    public User Login(User user){
        return userDao.Login(user);
    }
}
