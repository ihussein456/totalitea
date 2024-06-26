package com.example.totalitea.service.userService;

import com.example.totalitea.entity.UserData;
import com.example.totalitea.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataServiceImpl implements UserDataService{

    @Autowired
    UserDataRepository userDataRepository;

    //Get
    public List<UserData> getAllData(){
        return userDataRepository.findAll();
    }

    //Create
    @Override
    public UserData saveUser(UserData userData){
        return userDataRepository.save(userData);
    }

    //Delete
    @Override
    public void deleteUserById(int id) {
        userDataRepository.deleteById((long) id);

    }




}
