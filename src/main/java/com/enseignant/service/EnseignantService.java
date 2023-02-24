package com.enseignant.service;

import com.enseignant.entity.Enseignant;
import com.enseignant.repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantService {
    @Autowired
    private EnseignantRepository repository;

    public Enseignant saveEnseignant(Enseignant enseignant) {
        return repository.save(enseignant);
    }

    public List<Enseignant> saveEnseignants(List<Enseignant> enseignants) {
        return repository.saveAll(enseignants);
    }

    public List<Enseignant> getEnseignants() {
        return repository.findAll();
    }

    public Enseignant getEnseignantById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Enseignant getEnseignantByName(String name) {
        return repository.findByNomEns(name);

    }

    public String deleteEnseignant(int id) {
        repository.deleteById(id);
        return "enseignant removed !! " + id;
    }

    public Enseignant updateEnseignant(Enseignant enseignant) {
        Enseignant existingEnseignant = repository.findById(enseignant.getCodeEns()).orElse(null);
        existingEnseignant.setNomEns(enseignant.getNomEns());
        existingEnseignant.setPrenomEns(enseignant.getPrenomEns());
        existingEnseignant.setAdresseMailEns(enseignant.getAdresseMailEns());
        existingEnseignant.setGradeEns(enseignant.getGradeEns());
        existingEnseignant.setDateEmbauche(enseignant.getDateEmbauche());
        return repository.save(existingEnseignant);
    }


}
