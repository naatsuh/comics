package com.laercio.comics.repository;

import com.laercio.comics.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsauariosRepository extends JpaRepository <Usuarios, Long> {
}
