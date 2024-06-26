package com.example.totalitea.api;

import com.example.totalitea.entity.BasketData;
import com.example.totalitea.entity.TeaData;
import com.example.totalitea.entity.UserData;
import com.example.totalitea.service.basketService.BasketDataServiceImpl;
import com.example.totalitea.service.teaService.TeaDataService;
import com.example.totalitea.service.userService.UserDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    TeaDataService teaDataService;

    @Autowired
    UserDataServiceImpl userDataService;

    @Autowired
    BasketDataServiceImpl basketDataService;

    //GET data For TEAS
    @GetMapping("/getdata")
    public List<TeaData> getData(){
        return teaDataService.getTeaData();
    }

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    //USERS

    @GetMapping("/postdata")
    public ResponseEntity<List<UserData>> getUser(){
        return new ResponseEntity<List<UserData>>(userDataService.getAllData(), HttpStatus.OK);
    }

    @PostMapping("/postdata")
    public ResponseEntity<UserData> saveUser(@Validated @RequestBody UserData userData){
        return new ResponseEntity<>(userDataService.saveUser(userData), HttpStatus.CREATED);
    }

    @DeleteMapping("/postdata/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable int id){
        userDataService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //Basket

    @GetMapping("/postbasket")
    public ResponseEntity<List<BasketData>> getBasket(){
        return new ResponseEntity<List<BasketData>>(basketDataService.getAllBasket(), HttpStatus.OK);
    }

    @PostMapping("/postbasket")
    public ResponseEntity<BasketData> saveBasket(@Validated @RequestBody BasketData basketData){
        return new ResponseEntity<>(basketDataService.saveBasket(basketData), HttpStatus.CREATED);
    }

    @DeleteMapping("/postbasket/{id}")
    public ResponseEntity<HttpStatus> deleteBasket(@PathVariable int id){
        basketDataService.deleteBasketItemById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
