package org.example.dao;

import org.example.Animal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnimalDao extends BaseDao<Animal>{
    public AnimalDao(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Animal element) throws SQLException {
        request = "INSERT INTO animals (name,species) values (?,?)";
        statement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,element.getname());
        statement.setString(2,element.getspecies());
        int nbRow = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if (resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRow == 1;
    }

    @Override
    public boolean update(Animal element) throws SQLException {
        request = "UPDATE animals set name = ?, species = ? where id = ?";
        statement = connection.prepareStatement(request);
        statement.setString(1,element.getname());
        statement.setString(2,element.getspecies());
        statement.setInt(3,element.getId());
        int nbRow = statement.executeUpdate();
        return nbRow == 1;
    }

    @Override
    public boolean delete(Animal element) throws SQLException {
        request = "DELETE from animals where id = ?";
        statement = connection.prepareStatement(request);
        statement.setInt(1,element.getId());
        int nbRow = statement.executeUpdate();
        return nbRow == 1;
    }

    @Override
    public Animal get(int id) throws SQLException {
        Animal animal = null;
        request = "SELECT * FROM animals where id = ?";
        statement = connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if (resultSet.next()){
            animal = new Animal(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("species"));
        }
        return animal;
    }

    @Override
    public List<Animal> get() throws SQLException {
        List<Animal> animals = new ArrayList<>();
        request = "SELECT * FROM animals";
        statement = connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            Animal animal = new Animal(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("species"));
            animals.add(animal);
        }
        return animals;
    }
}
