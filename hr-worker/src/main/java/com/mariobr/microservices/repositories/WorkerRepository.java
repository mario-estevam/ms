package com.mariobr.microservices.repositories;


import com.mariobr.microservices.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
