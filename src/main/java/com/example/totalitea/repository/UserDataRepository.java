package com.example.totalitea.repository;

import com.example.totalitea.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository <UserData, Long> {
}
