package org.example.api_rest_exercice3.controller;

import jakarta.servlet.http.HttpSession;
import org.apache.catalina.LifecycleState;
import org.example.api_rest_exercice3.dto.ProdResponseDto;
import org.example.api_rest_exercice3.service.ProduitService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/user/session")
public class ProdSessionController {

    private ProduitService service;

    private HttpSession session;

    public ProdSessionController(ProduitService service,HttpSession httpSession) {
        this.service = service;
        session = httpSession;
    }

    @GetMapping("/panier/{id}")
    public ResponseEntity<String> addToPan (@PathVariable long id){
        List<Long> panId = (List<Long>) session.getAttribute("panier");

        if(panId == null){
            panId = new ArrayList<>();
        }


        panId.add(service.getById(id).getId());

        session.setAttribute("panier",panId);
        return ResponseEntity.ok("product add to favorite");
    }

    @GetMapping("/getpanier")
    public ResponseEntity<List<ProdResponseDto>> getFav (){
        List<Long> panId = (List<Long>) session.getAttribute("panier");
        List<ProdResponseDto> prodResponseDtos = new ArrayList<>();

        if(panId != null){
            for (long id : panId){
                prodResponseDtos.add(service.getById(id));
            }
        }else{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ArrayList<>());
        }
        return ResponseEntity.ok(prodResponseDtos);
    }


}
