package com.cwcdev.aula;


import com.cwcdev.aula.entities.Employee;
import com.cwcdev.aula.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.cwcdev"})
public class SpringNelioAlvesApplication implements CommandLineRunner {

     @Autowired
     private SalaryService salaryService;
    public static void main(String[] args) {
        SpringApplication.run(SpringNelioAlvesApplication.class, args);
    }

    @Override
    public void run(String... args) {
       Employee employee = new Employee("maria",4000.00);
        System.out.println(salaryService.netSalary(employee));


    }
}
