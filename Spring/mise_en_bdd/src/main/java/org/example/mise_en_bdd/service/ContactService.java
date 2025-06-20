package org.example.mise_en_bdd.service;

import org.example.mise_en_bdd.dao.ContactRepository;
import org.example.mise_en_bdd.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact save(Contact contact){
        return contactRepository.save(contact);
    }

    public Contact update(Contact contact){
        return contactRepository.save(contact);
    }

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public Contact findById(int id){
        return contactRepository.findById(id).orElse(null);
    }

    public void delete(Contact contact){
        contactRepository.delete(contact);
    }
}
