package org.example.tp_environnement.service;

import org.example.tp_environnement.dto.specy.SpecyReceiveDto;
import org.example.tp_environnement.dto.specy.SpecyResponseDto;
import org.example.tp_environnement.entity.Specy;
import org.example.tp_environnement.repository.SpecyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecyService {


    public final SpecyRepository repo;

    public SpecyService(SpecyRepository specyRepository){
        this.repo = specyRepository;
    }

    //CREATE
    public SpecyResponseDto create(SpecyReceiveDto specyReceiveDto) {
        System.out.println("méthode create");
        return repo.save(specyReceiveDto.dtoToEntity()).entityToDto();
    }


    //READ
    public List<SpecyResponseDto> getList(){
        System.out.println("méthode getList");
        return repo.findAll().stream().map(Specy::entityToDto).toList();
    }

    //GET BY ID
    public SpecyResponseDto getById(Long id){
        System.out.println("méthode getById");
        return repo.findById(id).orElse(null).entityToDto();
    }

    //UPDATE
    public SpecyResponseDto update(long id, SpecyReceiveDto specyReceiveDto){
        System.out.println("Service::update");
        Specy specyFound = repo.findById(id).orElse(null);
        Specy specyReceive = dtoToEntity(specyReceiveDto);
        specyFound.setCommonName(specyReceive.getCommonName());
        specyFound.setScientificName(specyReceive.getScientificName());
        specyFound.setCategory(specyReceive.getCategory());
        return repo.save(specyFound).entityToDto();
    }

    private Specy dtoToEntity( SpecyReceiveDto receiveDto){
        System.out.println("Service::dtoToEntity");
        return Specy.builder()
                .commonName(receiveDto.getCommonName())
                .scientificName(receiveDto.getScientificName())
                .category(receiveDto.getCategory())
                .build();
    }

    //DELETE
   public void delete (long id){
       System.out.println("Service::delete");
        repo.deleteById(id);
   }

}
