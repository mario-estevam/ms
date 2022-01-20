package com.mariobr.microservices.resources;

import com.mariobr.microservices.entities.Worker;
import com.mariobr.microservices.repositories.WorkerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RefreshScope
@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private Environment env;

    @Autowired
    private WorkerRepository repository;

    @Value("${test.config}")
    private String testConfig;

    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/configs")
    public ResponseEntity<Void> getConfig(){
        logger.info("CONFIG ="+testConfig);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){

        logger.info("PORT = " + env.getProperty("local.server.port"));
        Worker obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
