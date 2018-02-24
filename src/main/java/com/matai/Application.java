package com.matai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.matai.dao")
@ServletComponentScan
@EnableTransactionManagement
@SpringBootApplication
public class Application {

    public static void main(String[] args)  {
        SpringApplication.run(Application.class, args);
    }

}
