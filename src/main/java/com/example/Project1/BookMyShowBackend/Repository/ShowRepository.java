package com.example.Project1.BookMyShowBackend.Repository;

import com.example.Project1.BookMyShowBackend.Model.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {
}
