package org.example.tp_environnement.service;


import org.example.tp_environnement.dto.observation.ObsReceiveDto;
import org.example.tp_environnement.dto.observation.ObsResponseDto;
import org.example.tp_environnement.dto.specy.SpecyReceiveDto;
import org.example.tp_environnement.dto.specy.SpecyResponseDto;
import org.example.tp_environnement.entity.Observation;
import org.example.tp_environnement.entity.Specy;
import org.example.tp_environnement.repository.ObservationRepository;
import org.example.tp_environnement.repository.SpecyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObsService {


    public final ObservationRepository repo;
    public final SpecyRepository speRepo;


    public ObsService(ObservationRepository obsRepository, SpecyRepository specyRepository){
        this.repo = obsRepository;
        this.speRepo = specyRepository;
    }

    //CREATE
    public ObsResponseDto create(ObsReceiveDto obsReceiveDto) {
        System.out.println("méthode create");
        return repo.save(obsReceiveDto.dtoToEntity(speRepo)).entityToDto();
    }

    //GET BY ID
    public ObsResponseDto getById(Long id){
        System.out.println("méthode getById");
        return repo.findById(id).orElse(null).entityToDto();
    }

    //READ
    public List<ObsResponseDto> getList(){
        System.out.println("méthode getList");
        return repo.findAll().stream().map(Observation::entityToDto).toList();
    }

    //DELETE
    public void delete (long id){
        System.out.println("Service::delete");
        repo.deleteById(id);
    }

     /*
    //UPDATE
    public ObsResponseDto update(long id, ObsReceiveDto obsReceiveDto){
        System.out.println("Service::update");
        Observation obsFound = repo.findById(id).orElse(null);
        Observation obsReceive = dtoToEntity(obsReceiveDto);
        obsFound.setLocation(obsReceive.getLocation());
        obsFound.setLatitude(obsReceive.getLatitude());
        obsFound.setLongitude(obsReceive.getLongitude());
        obsFound.setObservationDate(obsReceive.getObservationDate());
        obsFound.setComment(obsReceive.getComment());
        return repo.save(obsFound).entityToDto();
    }


    private Observation dtoToEntity( ObsReceiveDto receiveDto){
        System.out.println("Service::dtoToEntity");
        return Observation.builder()
                .location(receiveDto.getLocation())
                .latitude(receiveDto.getLatitude())
                .longitude(receiveDto.getLongitude())
                .observationDate(receiveDto.getObservationDate())
                .comment(receiveDto.getComment())
                .specy()
                .build();
    }
    */




}

