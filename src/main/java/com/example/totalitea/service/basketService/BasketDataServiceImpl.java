package com.example.totalitea.service.basketService;

import com.example.totalitea.entity.BasketData;
import com.example.totalitea.repository.BasketDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketDataServiceImpl implements BasketDataService {
    @Autowired
    BasketDataRepository basketDataRepository;

    //Get
    public List<BasketData> getAllBasket() {
        return basketDataRepository.findAll();
    }

    //Create
    @Override
    public BasketData saveBasket(BasketData basketData) {
        return basketDataRepository.save(basketData);
    }

    //Delete
    @Override
    public void deleteBasketItemById(int id) {
        basketDataRepository.deleteById((long) id);


    }
}
