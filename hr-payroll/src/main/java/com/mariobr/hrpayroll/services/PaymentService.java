package com.mariobr.hrpayroll.services;

// esse projeto não tem banco de dados, ele só tem regra de negócio
//por isso utilizamos o service


import com.mariobr.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days){
        return new Payment("bob", 200.0, days); //harded code para teste
    }
}
