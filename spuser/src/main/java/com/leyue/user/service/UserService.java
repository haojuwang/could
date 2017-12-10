package com.leyue.user.service;


import com.leyue.user.model.User;

import java.util.List;

/**
 * Created by lihao on 17/11/30.
 */
public interface UserService {
    List<User> findByName(String userName);

    List<User> allListByOrder(String filed);

    void insertUser(User user) ;
    void insertUser2(User user) ;

    List<User> search(User user);

    List<User> search2(User user);

    void update(User user);

}
