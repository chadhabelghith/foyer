package com.example.foyerbichadha.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.foyerbichadha.entities.Universite;
@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
