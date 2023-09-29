package com.example.Project1.BookMyShowBackend.Repository;

import com.example.Project1.BookMyShowBackend.Model.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
}
