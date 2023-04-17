package com.scm.crud.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.scm.crud.model.Pet;

public class PetDAOImplTest {
    private DriverManagerDataSource dataSource;
    private PetDAO dao;
    
   @Test
   public void testSave() {
       dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("com.mysql.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://localhost:3306/pet_list_db");
       dataSource.setUsername("root");
       dataSource.setPassword("#hh@root2023");
       dao = new PetDAOImpl(dataSource);
       Pet pet = new Pet("Kyar Bo","Male","2years","Dog","Running");
       int result = dao.savePet(pet);
       assertTrue(result > 0);
   }
}
