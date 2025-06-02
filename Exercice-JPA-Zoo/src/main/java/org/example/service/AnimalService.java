package org.example.service;

import org.example.dao.AnimalDao;
import org.example.Animal;
import org.example.util.DatabaseManager;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AnimalService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private AnimalDao animalDao;
    private Connection connection;


    private String regimeAlimentaire;
    private String dateArriveeZoo;


    public AnimalService() {
        try {
            connection = new DatabaseManager().getConnection();
            animalDao = new AnimalDao(connection);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public boolean createAnimal(String name, String species){
        Animal animal = new Animal(name,species);
        try {
            if(animalDao.save(animal)){
                return true;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean updateAnimal(Animal animal){
        try {
            if(animalDao.update(animal)){
                return true;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public Animal getAnimal(int id){
        try {
            return animalDao.get(id);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean deleteAnimal(int id){
        Animal animal = null;
        try {
            animal = animalDao.get(id);
            if(animal != null){
                return animalDao.delete(animal);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public List<Animal> getAllAnimal(){
        try {
            return animalDao.get();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }



}
