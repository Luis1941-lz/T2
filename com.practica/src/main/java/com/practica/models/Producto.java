package com.practica.models;



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
@Table(name="tbl_producto")
public class Producto {
	
	@Id
	@Column(name="id")
	private int codProd;
	
	@Column(name="nombre" , nullable = false)
	private String nombre;

	@Column(name="stock_maximo" , nullable = false)
	private int stk_max;
	
	@Column(name="stock_actual", nullable = false)
	private int stk_act;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
}
