package com.mariobr.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    // metodo que registra uma instancia única do objeto do tipo RestTemplate, e essa instancia fica disponivél para
    //injetar em outros componentes
    // criar componente a partir de chamada de metodo
    @Bean
    public RestTemplate getRestTemplate(){
     return new RestTemplate();
    }
}
