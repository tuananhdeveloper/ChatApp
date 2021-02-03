package com.tuananh.ChatApp.services.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuananh.ChatApp.dao.DaoImpl.DAO;
import com.tuananh.ChatApp.dao.DaoImpl.UserDao;
import com.tuananh.ChatApp.enities.User;

@Service
public class UserService {
    @Autowired
    private UserDao dao;

    public List<User> getAllUser() {
        return dao.getAll();
    }
}
