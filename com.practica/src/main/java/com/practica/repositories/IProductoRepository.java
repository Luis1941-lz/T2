package com.practica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.models.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer>{

}
