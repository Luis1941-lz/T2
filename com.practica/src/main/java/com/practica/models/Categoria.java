package com.practica.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="tbl_categoria")
public class Categoria {
	
	
	@Id
	@Column(name = "id")
	private int codigo;
	
	@Column(name = "descripcion", nullable = false)
	private String desc;
	
	@Column(name= "frecuencia_compra" , nullable = false)
	private String frecuencia_boleta;

}
