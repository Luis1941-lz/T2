package com.practica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.models.Inventario;

public interface IInventorioRepository extends JpaRepository<Inventario, Integer> {

}
