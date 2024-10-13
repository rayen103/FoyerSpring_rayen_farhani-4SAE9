package com.example.first.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import com.example.first.entities.Bloc;
import services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
@ComponentScan(basePackages = {"services"}) // Use full package path if needed
public class BlocController {
    @Qualifier("IBlocService")
    private final IBlocService blocService;

    @PostMapping("/addbloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    @GetMapping("/findAll")
    public List<Bloc> findAll() {
        return blocService.getAllBloc();
    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc b) {
        return blocService.updateBloc(b);
    }

    @DeleteMapping("/deleteBloc/{id}")
    public void deleteChambre(@PathVariable Long id) {
        blocService.deleteBloc(id);
    }
}
