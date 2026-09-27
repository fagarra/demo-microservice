package com.tecnocomfenalco.demomicroservice.repository;

import com.tecnocomfenalco.demomicroservice.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByDisponibleTrue();
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
}