package com.example.foyer_springboot.controller;

import com.example.foyer_springboot.entities.Universite;
import com.example.foyer_springboot.services.IUniversiteService;
import com.example.foyer_springboot.services.UniversiteServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="gestion universite")
@RequestMapping("/universite")
@RestController
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService service;
    UniversiteServiceImpl serviceImpl;
    @Operation(description = "Ajouter une nouvelle université")
    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite u){
        return service.addUniversite(u);
    }
    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite u){
        return  service.updateUniversite(u);
    }
    @GetMapping("/get-all")
    public List<Universite> getAllUniversite(){
        return service.getAllUniversite();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUniversite(@PathVariable("id") Long id){
        service.deleteUniversite(id);
    }
    @PostMapping("/affecter-foyer-universite")
    public Universite affecterFoyerAUniversite(@RequestParam("idFoyer") Long idFoyer,
                                               @RequestParam("nomUniversite") String nomUniversite){
        return serviceImpl.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }
    @PostMapping("/desaffecter-foyer-universite")
    public Universite desaffecterFoyerAUniversite(@RequestParam("idUniversite") Long idUniversite){
        return serviceImpl.desaffecterFoyerAUniversite(idUniversite);
    }
}
