package com.example.hruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class HrUserApplication implements CommandLineRunner {

    @Autowired
    private BCryptPasswordEncoder pass;

    public static void main(String[] args) {
        SpringApplication.run(HrUserApplication.class, args);
    }

    @Override
    public void run(String...args) throws Exception{
        //System.out.println("BCRYPT = " + pass.encode("12445"));//macete pra gerar o BCrypt
    }

}
