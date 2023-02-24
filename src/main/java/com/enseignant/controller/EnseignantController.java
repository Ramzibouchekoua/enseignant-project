package com.enseignant.controller;

import com.enseignant.entity.Enseignant;
import com.enseignant.service.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class EnseignantController {

    @Autowired
    private EnseignantService service;

    @PostMapping("/addEnseignant")
    public Enseignant addEnseignant(@RequestBody Enseignant enseignant) {
        return service.saveEnseignant(enseignant);
    }

    @PostMapping("/addEnseignants")
    public List<Enseignant> addEnseignants(@RequestBody List<Enseignant> enseignants) {
        return service.saveEnseignants(enseignants);
    }

    @GetMapping("/enseignants")
    public List<Enseignant> findAllEnseignants() {
        return service.getEnseignants();
    }

    @GetMapping("/enseignantById/{id}")
    public Enseignant findEnseignantById(@PathVariable int id) {
        return service.getEnseignantById(id);
    }

    @GetMapping("/enseignant/{name}")
    public Enseignant findEnseignantByName(@PathVariable String name) {
        return service.getEnseignantByName(name);
    }

    @PutMapping("/update")
    public Enseignant updateEnseignant(@RequestBody Enseignant enseignant) {
        return service.updateEnseignant(enseignant);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEnseignant(@PathVariable int id) {
        return service.deleteEnseignant(id);
    }
}
