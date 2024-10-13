package com.example.first.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.first.entities.Reservation;
import com.example.first.entities.Universite;
import services.IReservationService;
import services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteServicee;

    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite u){
        return universiteServicee.addUniversite(u);
    }

    @GetMapping("/findAll")
    List<Universite> findAll(){
        return universiteServicee.getAllUniversite();
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite u){
        return universiteServicee.updateUniversite(u);
    }

    @DeleteMapping("/deleteUniversite/{id}")
    void deleteUniversite(@PathVariable Long id){
        universiteServicee.deleteUniversite(id);
    }
}