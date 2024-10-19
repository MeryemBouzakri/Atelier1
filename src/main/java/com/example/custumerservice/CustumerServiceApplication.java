package com.example.custumerservice;

import com.example.custumerservice.Dao.entities.Customer;
import com.example.custumerservice.Dao.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CustumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustumerServiceApplication.class, args);
    }
@Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("MERYEM").email("bouzakri@gmail.com").build());
            customerRepository.save(Customer.builder().name("ADNANE").email("bakkou@gmail.com").build());

        };
}
}
