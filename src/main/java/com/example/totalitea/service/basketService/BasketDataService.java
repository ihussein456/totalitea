package com.example.totalitea.service.basketService;

import com.example.totalitea.entity.BasketData;
import com.example.totalitea.entity.UserData;

import java.util.List;

public interface BasketDataService {

    List<BasketData> getAllBasket();

    //Post
    BasketData saveBasket(BasketData basketData);

    //Delete
    void deleteBasketItemById(int id);

}
