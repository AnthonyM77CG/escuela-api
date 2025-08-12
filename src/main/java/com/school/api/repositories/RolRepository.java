package com.school.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.api.entities.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{
    
    Optional<Rol> findByName(String name);
}
