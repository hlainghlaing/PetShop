package com.scm.crud.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.scm.crud.dao.PetDAO;
import com.scm.crud.dao.PetDAOImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.scm.crud")
public class AppConfig{
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/pet_list_db");
        dataSource.setUsername("root");
        dataSource.setPassword("#hh@root2023");
        return dataSource;
    }
    
    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public PetDAO getContactDAO() {
        return new PetDAOImpl(getDataSource());
    }
}
