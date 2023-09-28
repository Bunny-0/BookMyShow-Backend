package com.example.Project1.BookMyShowBackend.Repository;

import com.example.Project1.BookMyShowBackend.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Id>  {
    Optional<UserEntity> findById(int id);
}
