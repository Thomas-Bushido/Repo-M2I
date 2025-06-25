package org.example.api_rest_exercice2.service;

import org.example.api_rest_exercice2.dto.DirReceiveDto;
import org.example.api_rest_exercice2.dto.DirResponseDto;
import org.example.api_rest_exercice2.dto.MovReceiveDto;
import org.example.api_rest_exercice2.dto.MovResponseDto;
import org.example.api_rest_exercice2.exception.NotFoundException;
import org.example.api_rest_exercice2.model.Director;
import org.example.api_rest_exercice2.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class MovieService  {

    private final MovieRepository movRepo;
    private final DirectorRepository dirRepo;

    public MovieService(MovieRepository movieRepository, DirectorRepository directorRepository) {
        this.movRepo = movieRepository;
        this.dirRepo = directorRepository;
    }

    public MovResponseDto create(MovReceiveDto movReceiveDto) {
        return   movRepo.save(movReceiveDto.movToModel(dirRepo)).modelToDto();
    }

    public List<MovResponseDto> get() {
        return movRepo.findAll().stream().map(Movie::modelToDto).toList();
    }

    public MovResponseDto getById(long id){
        return movRepo.findById(id).orElseThrow(NotFoundException::new).modelToDto();
    }



}
