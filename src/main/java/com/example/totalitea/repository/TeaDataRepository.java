package com.example.totalitea.repository;

import com.example.totalitea.entity.TeaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeaDataRepository extends JpaRepository<TeaData, Long> {
}
