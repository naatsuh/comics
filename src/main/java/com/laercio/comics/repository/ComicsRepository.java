package com.laercio.comics.repository;

import com.laercio.comics.model.Comics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComicsRepository extends JpaRepository <Comics, Long> {
    List<Comics> findByusuarioid (Long usuarioid);
}
