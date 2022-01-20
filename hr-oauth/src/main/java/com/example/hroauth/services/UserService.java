package com.example.hroauth.services;

import com.example.hroauth.entities.User;
import com.example.hroauth.feignClients.UserFeignClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    Logger logger  = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserFeignClients userFeignClients;

    public User findByEmail(String email){
        User user = userFeignClients.findByEmail(email).getBody();
        if(user == null){
            logger.error("email not found: " +email);
            throw new IllegalArgumentException("email not found");
        }
        logger.info("email found: " + email);
        return user;
    }

}
