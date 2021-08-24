package com.example.msjavaspring.cloud.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msjavaspring.cloud.entities.Worker;
import com.example.msjavaspring.cloud.repositories.WorkerRepository;



@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<java.util.List<Worker>> findAll(){
		java.util.List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}

}
