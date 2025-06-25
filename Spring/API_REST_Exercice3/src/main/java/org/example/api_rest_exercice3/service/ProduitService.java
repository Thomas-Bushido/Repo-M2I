package org.example.api_rest_exercice3.service;
import org.example.api_rest_exercice3.exception.NotFoundException;
import org.example.api_rest_exercice3.dto.ProdReceiveDto;
import org.example.api_rest_exercice3.dto.ProdResponseDto;
import org.example.api_rest_exercice3.entity.Produit;
import org.example.api_rest_exercice3.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository prodRep;

    public ProduitService(ProduitRepository prodRep){
        this.prodRep = prodRep;
    }

    public ProdResponseDto create(ProdReceiveDto prodReceiveDto){
        return prodRep.save(prodReceiveDto.dtoToEntity()).entityToDto();
    }

    public List<ProdResponseDto> getList(){
        return prodRep.findAll().stream().map(Produit::entityToDto).toList();
    }

    public ProdResponseDto getById(long id){
        return prodRep.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }
}
