package com.mariobr.hrpayroll.feignClients;


import com.mariobr.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component // transforma num componente gerenciado pelo Spring
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id);
}
