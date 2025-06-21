package com.practica.models;

import java.time.LocalDate;
import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_inventario")
public class Inventario {
	
	@Id
	@Column(name="numero")
	private int num;
	
	@Column(name="fecha_vencimiento", nullable = false)
	private LocalDate  fch_nam;
	
	@Column(name="costo_ingreso", nullable = false)
	private double cst_ing;
	
	@Column(name="cantidad" , nullable = false)
	private int cant;
	
	@Column(name="lote", nullable = false)
	private String lote;
	
	@Column(name="cod_estado", nullable = false)
	private String cod_est;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_producto")
	private Producto producto;
}
