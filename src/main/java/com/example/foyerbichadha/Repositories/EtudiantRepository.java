package com.example.foyerbichadha.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.foyerbichadha.entities.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
