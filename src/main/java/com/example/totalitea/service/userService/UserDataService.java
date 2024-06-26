package com.example.totalitea.service.userService;

import com.example.totalitea.entity.UserData;

import java.util.List;

public interface UserDataService {

    //Get
    List<UserData> getAllData();

    //Post
    UserData saveUser(UserData userData);

    //Delete
    void deleteUserById(int id);


}
