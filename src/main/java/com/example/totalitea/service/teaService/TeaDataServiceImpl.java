package com.example.totalitea.service.teaService;

import com.example.totalitea.entity.TeaData;
import com.example.totalitea.repository.TeaDataRepository;
import com.example.totalitea.service.teaService.TeaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeaDataServiceImpl implements TeaDataService {

    @Autowired
    TeaDataRepository teaDataRepository;

    @Override
    public List<TeaData> getTeaData(){
        return teaDataRepository.findAll();
    }
}
