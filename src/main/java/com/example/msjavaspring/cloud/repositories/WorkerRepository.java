package com.example.msjavaspring.cloud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.msjavaspring.cloud.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

	
}
