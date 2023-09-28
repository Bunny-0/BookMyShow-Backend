package com.example.Project1.BookMyShowBackend.Repository;

import com.example.Project1.BookMyShowBackend.Model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepsitory extends JpaRepository<MovieEntity,Integer> {
}
