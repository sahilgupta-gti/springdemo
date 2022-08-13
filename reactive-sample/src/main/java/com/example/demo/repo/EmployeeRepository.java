package com.example.demo.repo;

import com.example.demo.dto.EmployeeDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

@Service
@Slf4j
public class EmployeeRepository {

    public Flux<EmployeeDTO> getAllEmployees() {
        int count = new Random().nextInt(100) + 1;
        log.info("Current Employee count: {}", count);

        Flux<EmployeeDTO> employees = Flux.range(0, count)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> log.info("Current Employee: {}", i))
                .map(
                        i -> new EmployeeDTO(i, "Employee" + i, i)
                );
        return employees;

    }

}
