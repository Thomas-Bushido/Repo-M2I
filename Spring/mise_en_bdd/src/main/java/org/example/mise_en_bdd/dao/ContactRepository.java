package org.example.mise_en_bdd.dao;

import org.example.mise_en_bdd.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact,Integer> {
    Contact findPersonByFirstnameAndLastname(String firstname, String lastname);
}
