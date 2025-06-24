package org.example.api_rest_exercice2.service;

import org.example.api_rest_exercice2.dto.DirReceiveDto;
import org.example.api_rest_exercice2.dto.DirResponseDto;
import org.example.api_rest_exercice2.model.Director;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class DirectorService {

   private final DirectorRepository dirRepo;

    public DirectorService(DirectorRepository directorRepository) {
        this.dirRepo = directorRepository;

    }


    public DirResponseDto create(DirReceiveDto dirReceiveDto) {
     return   dirRepo.save(dirReceiveDto.dirToModel()).modelToDto();
    }

    public List<DirResponseDto> get() {
        return dirRepo.findAll().stream().map(Director::modelToDto).toList();
    }

/*
    public void delete(UUID id) {

    }


    public Director getById(UUID id) {
        return null;
    }


    public Director update(UUID id, Director entity) {
        return null;
    }
    */

}
