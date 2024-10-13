package com.example.first.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.first.entities.chambre;
import com.example.first.entities.Etudiant;
import services.IChambreService;
import services.IEtudiantService;
import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {
    IEtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
    }

    @GetMapping("/findAll")
    List<Etudiant> findAll(){
        return etudiantService.getAllEtudiant();
    }

    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant e){
        return etudiantService.updateEtudiant(e);
    }

    @DeleteMapping("/deleteEtudiant/{id}")
    void deleteEtudiant(@PathVariable Long id){
        etudiantService.deleteEtudiant(id);
    }
}