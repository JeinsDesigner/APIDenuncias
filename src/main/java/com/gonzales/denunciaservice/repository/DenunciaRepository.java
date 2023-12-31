package com.gonzales.denunciaservice.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gonzales.denunciaservice.entity.Denuncia;

@Repository
public interface DenunciaRepository extends JpaRepository<Denuncia, Integer>{
	List<Denuncia> findByDniContaining(String nombre, Pageable page);
}
