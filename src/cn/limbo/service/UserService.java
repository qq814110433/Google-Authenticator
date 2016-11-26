package cn.limbo.service;

import cn.limbo.entity.User;

import java.util.List;

/**
 * Created by limbo on 2016/11/26.
 */
public interface UserService {

    public User getUserByID(String ID);

    public List<User> getAllUsers();

    public void addUser(String name,String password);

    public void deleteUserByID(String ID);

    public void updateUser(User user);

}
