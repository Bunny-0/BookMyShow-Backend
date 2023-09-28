package com.example.Project1.BookMyShowBackend.Repository;

import com.example.Project1.BookMyShowBackend.Model.ShowSeatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatsRepository extends JpaRepository<ShowSeatsEntity,Integer> {
}
