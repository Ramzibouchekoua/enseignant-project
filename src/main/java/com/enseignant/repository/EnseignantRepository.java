package com.enseignant.repository;

import com.enseignant.entity.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant,Integer> {
    Enseignant findByNomEns(String name);
}

