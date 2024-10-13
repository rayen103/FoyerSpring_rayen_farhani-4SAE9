package com.example.first.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.example.first.entities.chambre;
import services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;

    @PostMapping("/addChambre")
    chambre addChambre(@RequestBody chambre c){
        return chambreService.addChambre(c);
    }

    @GetMapping("/findAll")
    List<chambre> findAll(){
        return chambreService.getAllChambre();
    }

    @PutMapping("/updateChambre")
    chambre updateChambre(@RequestBody chambre c){
        return chambreService.updateChambre(c);
    }

    @DeleteMapping("/deleteChambre/{id}")
    void deleteChambre(@PathVariable Long id){
        chambreService.deleteChambre(id);
    }
}