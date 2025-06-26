package org.example.tp_environnement.service;



import org.example.tp_environnement.dto.specy.SpecyReceiveDto;
import org.example.tp_environnement.dto.travellog.TravReceiveDto;
import org.example.tp_environnement.dto.travellog.TravResponseDto;
import org.example.tp_environnement.entity.TravelMode;
import org.example.tp_environnement.entity.Travellog;
import org.example.tp_environnement.repository.TravellogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravService {

    public final TravellogRepository repo;

    public TravService(TravellogRepository travellogRepository){
        this.repo = travellogRepository;
    }
    //CREATE
    public TravResponseDto create(TravReceiveDto travReceiveDto) {
        System.out.println("méthode create");
        return repo.save(travReceiveDto.dtoToEntity()).entityToDto();
    }


    //READ
    public List<TravResponseDto> getList(){
        System.out.println("méthode getList");
        return repo.findAll().stream().map(Travellog::entityToDto).toList();
    }


    public List<TravResponseDto> calculCo2 (Long id, List<Travellog>){

    }



}
