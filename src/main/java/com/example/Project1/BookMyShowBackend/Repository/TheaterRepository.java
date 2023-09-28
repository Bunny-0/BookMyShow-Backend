package com.example.Project1.BookMyShowBackend.Repository;

import com.example.Project1.BookMyShowBackend.Model.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}
